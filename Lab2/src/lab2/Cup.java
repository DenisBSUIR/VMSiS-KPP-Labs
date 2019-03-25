package lab2;
import javax.swing.JButton;
//import java.awt.Container;

public class Cup extends Thing {

    private Integer volume = 0;
    private String content = new String();
    JButton button = new JButton("Взять кружку");

    public Cup()
    {
        super(50);
    }

    public JButton getButton()
    {
        return  button;
    }

    public void addToPane(MyPane pane)
    {
        pane.getConstraints().setPosition(1,0,0);
        pane.getPane().add(button,pane.getConstraints().getConstraints());
    }

    public void setVolume(Integer volume)
    {
        this.volume+=volume;
    }


    public void fill(String ingredient)
    {
        ingredient.concat(ingredient);
    }

}
