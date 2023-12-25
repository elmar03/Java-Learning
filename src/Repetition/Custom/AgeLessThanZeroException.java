package Repetition.Custom;

public class AgeLessThanZeroException extends Exception{

    public AgeLessThanZeroException(){}

    public AgeLessThanZeroException (String message){
        super(message);
    }
}
