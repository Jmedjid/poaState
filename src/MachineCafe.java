/**
 * Created by jomedjid on 14/11/2016.
 */
public class MachineCafe {

    private MachineCafeState state;

    public void setState(MachineCafeState state) {
        this.state = state;
    }

    public MachineCafe(MachineCafeState state) {
        this.state = new DoNotHaveMoneyState(0);
    }

    public void give (int n){

    }

    public void getCoffee(){

    }

    public void getTea(){

    }


}
