package GUI;

import javax.swing.*;

public class Window {
    private JFrame frame = new JFrame("Window");
    private MyPane pane = new MyPane(frame.getContentPane());


    public void createAndShowWindow()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);
        frame.setResizable(true);
        frame.setVisible(true);
    }

    public void setStartWindow(){
        pane.getMyConstraints().setPosition(2,1,0);
        pane.getPane().add(pane.getClearButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(2,1,1);
        pane.getPane().add(pane.getNameTextField(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(2,1,2);
        pane.getPane().add(pane.getContinueButton(),pane.getMyConstraints().getConstraints());
    }

    public void setMainWindow(){
        pane.getPane().removeAll();
        pane.getPane().repaint();
        pane.getMyConstraints().setPosition(2,1,0);
        pane.getPane().add(pane.getClearButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,0,1);
        pane.getPane().add(pane.getAddButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,0,2);
        pane.getPane().add(pane.getSubtractButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,0,3);
        pane.getPane().add(pane.getMultiplyButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,0,4);
        pane.getPane().add(pane.getDivideButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,1,1);
        pane.getPane().add(pane.getAlgebraicFormLabelLabel(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,1,2);
      //  pane.getPane().add(pane.getExponentialFormLabelLabel(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,1,4);
        pane.getPane().add(pane.getResultLabel(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,1,3);
        pane.getPane().add(pane.getSaveButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(2,2,3);
    //    pane.getPane().add(pane.getTransferButton(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,2,1);
        pane.getPane().add(pane.getImaginaryTextField(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,3,1);
        pane.getPane().add(pane.getRealTextField(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,2,2);
    //    pane.getPane().add(pane.getModelTextField(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,3,2);
    //    pane.getPane().add(pane.getPhaseTextField(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,2,4);
        pane.getPane().add(pane.getResultFirstLabel(),pane.getMyConstraints().getConstraints());
        pane.getMyConstraints().setPosition(1,3,4);
        pane.getPane().add(pane.getResultSecondLabel(),pane.getMyConstraints().getConstraints());
    }

    public MyPane getPane() {
        return pane;
    }
}
