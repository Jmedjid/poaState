package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public interface MachineCafeState  {

     MachineCafeState give (int n) throws MachineException;
     MachineCafeState askCoffee() throws MachineException;
     MachineCafeState askTea() throws MachineException;

}
