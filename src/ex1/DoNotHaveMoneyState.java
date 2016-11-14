package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public class DoNotHaveMoneyState implements MachineCafeState{


    private int somme;

    public DoNotHaveMoneyState(int somme) {
        this.somme= somme;
    }

    @Override
    public MachineCafeState give(int n) {
        this.somme += n;
        return null;
    }

    @Override
    public MachineCafeState askCoffee() {
        System.out.println("");
        return new DoNotHaveMoneyState(0);
    }

    @Override
    public MachineCafeState askTea() {
        System.out.println("");
        return new DoNotHaveMoneyState(0);
    }
}
