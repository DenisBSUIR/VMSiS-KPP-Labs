package Numbers;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.atan;


public class ComplexNumberInExponentialForm extends ComplexNumber {

    private double module;
    private double phase;

    public void add(Number operand) {
        ComplexNumberInAlgebraicForm tempNumberRight = new ComplexNumberInAlgebraicForm();
        ComplexNumberInAlgebraicForm tempNumberLeft = new ComplexNumberInAlgebraicForm();
        this.translateIntoAlgebraicForm(tempNumberLeft);
        ((ComplexNumberInExponentialForm)operand).translateIntoAlgebraicForm(tempNumberRight);
        tempNumberLeft.add(tempNumberRight);
        tempNumberLeft.translateIntoExponentialForm(this);
    }

    public void subtract(Number operand){
        ComplexNumberInAlgebraicForm tempNumberRight = new ComplexNumberInAlgebraicForm();
        ComplexNumberInAlgebraicForm tempNumberLeft = new ComplexNumberInAlgebraicForm();
        this.translateIntoAlgebraicForm(tempNumberLeft);
        ((ComplexNumberInExponentialForm)operand).translateIntoAlgebraicForm(tempNumberRight);
        tempNumberLeft.subtract(tempNumberRight);
        tempNumberLeft.translateIntoExponentialForm(this);
    }

    public void multiply(Number operand){
        module *= ((ComplexNumberInExponentialForm)operand).getModule();
        phase += ((ComplexNumberInExponentialForm)operand).getPhase();
    }

    public void divide(Number operand){
        module /= ((ComplexNumberInExponentialForm)operand).getModule();
        phase -= ((ComplexNumberInExponentialForm)operand).getPhase();

    }

    public double getModule(){
        return module;
    }

    public double getPhase(){
        return phase;
    }

    public void translateIntoAlgebraicForm(ComplexNumberInAlgebraicForm number){
        this.module = sqrt(pow(number.getImaginaryPart(),2)+pow(number.getRealPart(),2));
        this.phase = atan(number.getRealPart()/number.getImaginaryPart());
    }
}
