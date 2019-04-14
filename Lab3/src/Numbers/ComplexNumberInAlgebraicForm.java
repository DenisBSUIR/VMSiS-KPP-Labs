package Numbers;
import Exceptions.NullValuesException;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.tan;
import static java.lang.Math.PI;


public class ComplexNumberInAlgebraicForm extends ComplexNumber {

    private double imaginaryPart;
    private double realPart;

    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart){
        this.realPart = realPart;
    }

    public void add(Number operand) throws NullValuesException {
        if((((ComplexNumberInAlgebraicForm)operand).getRealPart() == 0 & ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart() == 0) |
                (imaginaryPart == 0 & realPart == 0)){
            throw new NullValuesException(new IllegalArgumentException("NullValueException"));
        }
        imaginaryPart += ((ComplexNumberInAlgebraicForm)operand).getRealPart();
        realPart += ((ComplexNumberInAlgebraicForm)operand).getRealPart();
    }

    public void subtract(Number operand) throws NullValuesException{
        if((((ComplexNumberInAlgebraicForm)operand).getRealPart() == 0 & ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart() == 0) |
                (imaginaryPart == 0 & realPart == 0)){
            throw new NullValuesException(new IllegalArgumentException("NullValueException"));
        }

        imaginaryPart -= ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart();
        realPart -= ((ComplexNumberInAlgebraicForm)operand).getRealPart();
    }

    public void multiply(Number operand)throws NullValuesException{
        if((((ComplexNumberInAlgebraicForm)operand).getRealPart() == 0 & ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart() == 0) |
                (imaginaryPart == 0 & realPart == 0)){
            throw new NullValuesException(new IllegalArgumentException("NullValueException"));
        }

        realPart = realPart * ((ComplexNumberInAlgebraicForm)operand).getRealPart() -
                imaginaryPart * ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart();
        imaginaryPart = imaginaryPart * ((ComplexNumberInAlgebraicForm)operand).getRealPart() +
                realPart * ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart();
    }

    public void divide(Number operand)throws NullValuesException{
        if((((ComplexNumberInAlgebraicForm)operand).getRealPart() == 0 & ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart() == 0) |
                (imaginaryPart == 0 & realPart == 0)){
            throw new NullValuesException(new IllegalArgumentException("NullValueException"));
        }

        realPart = (realPart * ((ComplexNumberInAlgebraicForm)operand).getRealPart() + imaginaryPart * ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart()) /
                (pow(((ComplexNumberInAlgebraicForm)operand).getRealPart(),2) + pow(((ComplexNumberInAlgebraicForm)operand).getImaginaryPart(), 2));
        imaginaryPart = (imaginaryPart * ((ComplexNumberInAlgebraicForm)operand).getRealPart() - realPart * ((ComplexNumberInAlgebraicForm)operand).getImaginaryPart()) /
                (pow(((ComplexNumberInAlgebraicForm)operand).getRealPart(),2) + pow(((ComplexNumberInAlgebraicForm)operand).getImaginaryPart(), 2));
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public void translateIntoExponentialForm(ComplexNumberInExponentialForm number){
        double real, imaginary, realPowered2, imaginaryPowered2, phase;

        realPowered2 = pow(number.getModule(),2)/(1+pow(tan(number.getPhase()),2));
        phase = number.getPhase();
        while(phase > 2 * PI){
            phase -= 2 * PI;
        }
        if(phase < PI / 2 && phase > -PI/2){
            real = sqrt(realPowered2);
        } else {
            real = -sqrt(realPowered2);
        }

        imaginaryPowered2 = pow(number.getModule(),2)-realPowered2;
        if(phase >= 0 && phase <= PI){
            imaginary = sqrt(imaginaryPowered2);
        }else{
            imaginary = -sqrt(imaginaryPowered2);
        }

        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

}
