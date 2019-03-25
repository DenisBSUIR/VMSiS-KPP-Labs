package lab2;
import javax.swing.JButton;

public class Teapot extends Thing {

    private Integer volume;
    private Integer temperature;
    private JButton button = new JButton("Налить воды");

    public Teapot()
    {
       super(500);
    }

    public void addToPane(MyPane pane)
    {
        pane.getConstraints().setPosition(1,0,1);
        pane.getPane().add(button,pane.getConstraints().getConstraints());
        button.setEnabled(false);
    }

    public JButton getButton()
    {
        return button;
    }

    public void pour(Cup cup)
    {
        cup.setVolume(500);
        cup.fill("Water\n");
    }

    public void fillWithWater()
    {
        this.volume = 500;
    }
}
