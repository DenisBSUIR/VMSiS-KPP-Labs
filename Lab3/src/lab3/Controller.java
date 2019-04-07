package lab3;

import GUI.Window;
import Numbers.ComplexNumberInAlgebraicForm;
import Numbers.Expression;
import Numbers.Human;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {

    private Human human = new Human();
    private Window window = new Window();
    private Expression expression = new Expression();


    public void start(){
        window.createAndShowWindow();
        window.setStartWindow();
        setActionPerform();
    }

    private void setActionPerform(){
        window.getPane().getContinueButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                human.setName(window.getPane().getNameTextField().getText());
                window.setMainWindow();
            }
        });
        window.getPane().getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getPane().getPane().removeAll();
                window.getPane().getPane().repaint();
                window.getPane().getNameTextField().setText("");
                window.setStartWindow();
            }
        });

        window.getPane().getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComplexNumberInAlgebraicForm number = new ComplexNumberInAlgebraicForm();
                number.setImaginaryPart(Double.parseDouble(window.getPane().getImaginaryTextField().getText()));
                number.setRealPart(Double.parseDouble(window.getPane().getRealTextField().getText()));
                expression.addOperand(number);
                window.getPane().getImaginaryTextField().setText("");
                window.getPane().getRealTextField().setText("");
            }
        });

        window.getPane().getTransferButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        window.getPane().getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).add(expression.getOperands().get(1));
                window.getPane().getResultFirstLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                window.getPane().getResultSecondLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));

            }
        });

        window.getPane().getSubtractButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).subtract(expression.getOperands().get(1));
                window.getPane().getResultFirstLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                window.getPane().getResultSecondLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });

        window.getPane().getMultiplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).multiply(expression.getOperands().get(1));
                window.getPane().getResultFirstLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                window.getPane().getResultSecondLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });

        window.getPane().getDivideButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).divide(expression.getOperands().get(1));
                window.getPane().getResultFirstLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                window.getPane().getResultSecondLabel().setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });
    }

}
