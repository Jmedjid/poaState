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
    public MachineCafeState give(int n) throws MachineException {

        throw new MachineException("Erreur");
    }

    @Override
    public MachineCafeState askCoffee() {
        return new DoNotHaveMoneyState(0);

    }

    @Override
    public MachineCafeState askTea() {
        return new DoNotHaveMoneyState(0);
    }
}
