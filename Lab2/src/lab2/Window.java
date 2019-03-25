package lab2;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window {

    private JFrame frame = new JFrame("Window");
    private MyPane pane = new MyPane(frame.getContentPane());


    public void createAndShowWindow()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,200);
        frame.setResizable(true);
        frame.setVisible(true);
        pane.getConstraints().setPosition(1,0,2);
        pane.getPane().add(new JLabel("В кружке находится:"), pane.getConstraints().getConstraints());
    }

    public MyPane getPane()
    {
        return pane;
    }
}
