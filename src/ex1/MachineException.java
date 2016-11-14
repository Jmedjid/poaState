package ex1;

/**
 * Created by jomedjid on 14/11/2016.
 */
public class MachineException extends Exception {
    public MachineException(String string) {
        System.err.println(string);
    }
}
