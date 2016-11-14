package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public class HaveMoneyState implements MachineCafeState{

    private int credit;

    public HaveMoneyState(int credit) {
        this.credit = credit;
    }


    @Override
    public MachineCafeState give(int n) {

        credit += n;
        if (credit >=10)
        {
            return new HaveMoneyState(0);
        }
        else{
            return  this;
        }
    }

    @Override
    public MachineCafeState askCoffee() {
        //throw new MachineException ("");
       // return null;

        return new DoNotHaveMoneyState(0);

    }

    @Override
    public MachineCafeState askTea() {

        return new DoNotHaveMoneyState(0);
    }
}
