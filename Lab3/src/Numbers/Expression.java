package Numbers;
import Exceptions.NullValuesException;

import java.util.ArrayList;

public class Expression {

    private ArrayList<Number> operands =  new ArrayList<>();
    private String operation;
    private ComplexNumberInAlgebraicForm result = new ComplexNumberInAlgebraicForm();

    public void addOperand(ComplexNumberInAlgebraicForm operand){
        operands.add(operand);
    }

    public void calculate(){
        try {
            switch (operation) {
                case "add":
                    ((ComplexNumberInAlgebraicForm) operands.get(0)).add(operands.get(0));
                    break;
                case "subtract":
                    ((ComplexNumberInAlgebraicForm) operands.get(0)).subtract(operands.get(0));
                    break;
                case "multiply":
                    ((ComplexNumberInAlgebraicForm) operands.get(0)).multiply(operands.get(0));
                    break;
                case "divide":
                    ((ComplexNumberInAlgebraicForm) operands.get(0)).divide(operands.get(0));
                    break;
                default:
                    break;
            }
        } catch(NullValuesException e) {
            System.out.println("0 Values");
        }

    }

    public ArrayList<Number> getOperands(){
        return operands;
    }

    public String getOperation(){
        return operation;
    }
}
