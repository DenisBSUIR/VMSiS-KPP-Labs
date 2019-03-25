package lab2;
import javax.swing.JButton;

public class Sugar extends Thing {

    private JButton button = new JButton("Добавить сахар");

    public Sugar()
    {
        super(50);
    }

    public JButton getButton()
    {
        return button;
    }

    public void addToPane(MyPane pane)
    {
        pane.getConstraints().setPosition(1,1,0);
        pane.getPane().add(button,pane.getConstraints().getConstraints());
        button.setEnabled(false);
    }

    public void pour(Cup cup)
    {
        cup.fill("Sugar\n");
    }
}
