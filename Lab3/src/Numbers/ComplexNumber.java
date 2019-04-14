package Numbers;

import Exceptions.NullValuesException;

public abstract class ComplexNumber extends Number {

    public abstract void add(Number operand) throws NullValuesException;

    public abstract void subtract(Number operand) throws NullValuesException;

    public abstract void multiply(Number operand)throws NullValuesException;

    public abstract void divide(Number operand)throws NullValuesException;
}
