package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public class MachineCafe {

    private MachineCafeState state;


    public MachineCafe() {
        state = new DoNotHaveMoneyState(0);
    }

    public void give (int somme) throws MachineException {
        state = state.give(somme);

    }

    public void askCoffee() throws MachineException {
        state = state.askCoffee();
    }

    public void askTea() throws MachineException {
        state = state.askTea();
    }


}
