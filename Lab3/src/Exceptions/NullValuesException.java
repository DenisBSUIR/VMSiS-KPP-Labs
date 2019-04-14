package Exceptions;

public class NullValuesException extends Exception {
    public NullValuesException(Throwable e){
        initCause(e);
    }
}
