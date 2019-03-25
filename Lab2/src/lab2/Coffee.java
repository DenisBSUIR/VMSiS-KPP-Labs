package lab2;
import javax.swing.JButton;

public class Coffee extends Thing {
    String taste = new String();
    private JButton button = new JButton("Добавить кофе");


    public Coffee(String taste)
    {
        super(30);
        this.taste.concat(taste);
    }

    public void addToPane(MyPane pane)
    {
        pane.getConstraints().setPosition(1,1,1);
        pane.getPane().add(button,pane.getConstraints().getConstraints());
        button.setEnabled(false);
    }

    public JButton getButton()
    {
        return button;
    }

    public void pour(Cup cup)
    {
        cup.fill("Coffee\n");
    }
}
