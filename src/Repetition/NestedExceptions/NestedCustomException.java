package Repetition.NestedExceptions;

public class NestedCustomException extends RuntimeException {

    public NestedCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
