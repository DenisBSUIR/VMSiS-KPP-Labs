package GUI;

import Exceptions.NullValuesException;
import Numbers.ComplexNumberInAlgebraicForm;
import Numbers.Expression;
import Numbers.Human;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyPane {
    private Constraints constraints;
    private Container pane;

    private JButton clearButton = new JButton("Заново");

    private JButton continueButton = new JButton("Продолжить");
    private JTextField nameTextField = new JTextField();


    private JButton saveButton = new JButton("Добавить операнд");
    private JButton transferButton = new JButton("Перевести");
    private JButton addButton = new JButton("Сложить");
    private JButton subtractButton = new JButton("Вычесть");
    private JButton multiplyButton = new JButton("Умножить");
    private JButton divideButton = new JButton("Разделить");



    private JTextField imaginaryTextField = new JTextField();
    private JTextField realTextField = new JTextField();
    private JTextField modelTextField = new JTextField();
    private JTextField phaseTextField = new JTextField();

    private JLabel resultFirstLabel = new JLabel();
    private JLabel resultSecondLabel = new JLabel();
    private JLabel algebraicFormLabel = new JLabel("Алгебраическая форма:");
    private JLabel exponentialFormLabel = new JLabel("Показательная форма:");
    private JLabel resultLabel = new JLabel("Результат:");

    public JLabel getResultFirstLabel(){
        return resultFirstLabel;
    }

    public JLabel getResultSecondLabel(){
        return resultSecondLabel;
    }

    public JTextField getImaginaryTextField(){
        return imaginaryTextField;
    }

    public JTextField getRealTextField(){
        return realTextField;
    }

    public JTextField getModelTextField(){
        return modelTextField;
    }

    public JTextField getPhaseTextField(){
        return phaseTextField;
    }



    public JButton getSaveButton(){
        return saveButton;
    }

    public JLabel getAlgebraicFormLabelLabel(){
        return algebraicFormLabel;
    }

    public JLabel getExponentialFormLabelLabel(){
        return exponentialFormLabel;
    }

    public JLabel getResultLabel(){
        return  resultLabel;
    }

    public JButton getTransferButton(){
        return transferButton;
    }

    public JButton getAddButton(){
        return addButton;
    }

    public JButton getSubtractButton(){
        return subtractButton;
    }

    public JButton getMultiplyButton(){
        return multiplyButton;
    }

    public JButton getDivideButton(){
        return divideButton;
    }

    public JTextField getNameTextField(){
        return nameTextField;
    }

    public JButton getContinueButton(){
        return continueButton;
    }

    public JButton getClearButton(){
        return clearButton;
    }



    public MyPane(Container pane)
    {
        this.pane = pane;
        constraints = new Constraints(pane);
    }


    public void setActionPerform(Window window,Expression expression, Human human){
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                human.setName(nameTextField.getText());
                window.setMainWindow();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getPane().removeAll();
                getPane().repaint();
                nameTextField.setText("");
                window.setStartWindow();
                expression.getOperands().removeAll(expression.getOperands());
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComplexNumberInAlgebraicForm number = new ComplexNumberInAlgebraicForm();
                number.setImaginaryPart(Double.parseDouble(window.getPane().getImaginaryTextField().getText()));
                number.setRealPart(Double.parseDouble(window.getPane().getRealTextField().getText()));
                expression.addOperand(number);
                imaginaryTextField.setText("");
                window.getPane().getRealTextField().setText("");
            }
        });

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ((ComplexNumberInAlgebraicForm) expression.getOperands().get(0)).add(expression.getOperands().get(1));
                }
                catch(NullValuesException exc){
                    System.out.println("Operands with 0 value");
                }
                resultFirstLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                resultSecondLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));

            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ((ComplexNumberInAlgebraicForm) expression.getOperands().get(0)).subtract(expression.getOperands().get(1));
                }
                catch(NullValuesException exc){
                    System.out.println("Operands with 0 value");
                }
                resultFirstLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                resultSecondLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ((ComplexNumberInAlgebraicForm) expression.getOperands().get(0)).multiply(expression.getOperands().get(1));
                }
                catch(NullValuesException exc){
                    System.out.println("Operands with 0 value");
                }
                resultFirstLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                resultSecondLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ((ComplexNumberInAlgebraicForm) expression.getOperands().get(0)).divide(expression.getOperands().get(1));
                }
                catch(NullValuesException exc){
                    System.out.println("Operands with 0 value");
                }
                resultFirstLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getRealPart()));
                resultSecondLabel.setText(Double.toString(((ComplexNumberInAlgebraicForm)expression.getOperands().get(0)).getImaginaryPart()));
            }
        });
    }

    public Constraints getMyConstraints()
    {
        return constraints;
    }

    public Container getPane()
    {
        return pane;
    }


}
