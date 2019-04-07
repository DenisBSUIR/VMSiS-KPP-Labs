package GUI;

import javax.swing.*;
import java.awt.*;



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



    public Constraints getMyConstraints()
    {
        return constraints;
    }

    public Container getPane()
    {
        return pane;
    }


}
