package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public class DoNotHaveMoneyState implements MachineCafeState{


    private int credit;

    public DoNotHaveMoneyState(int credit) {
        super();
        this.credit= credit;
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
    public MachineCafeState askCoffee() throws MachineException {
        throw new MachineException("Erreur");
    }

    @Override
    public MachineCafeState askTea() throws MachineException {
        throw new MachineException("Erreur");
    }
}
