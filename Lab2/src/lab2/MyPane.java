package lab2;
import javax.swing.JLabel;
import java.awt.Container;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPane {

    private Constraints constraints;
    private Container pane;
    private Integer counter = 0;

    public MyPane(Container pane)
    {
        this.pane = pane;
        constraints = new Constraints(pane);
    }

    private JLabel sugarField = new JLabel();
    private JLabel coffeeField = new JLabel();
    private JLabel waterField = new JLabel();


    public void addJLabelFields()
    {
        constraints.setPosition(1,1,2);
        pane.add(sugarField,constraints.getConstraints());
        constraints.setPosition(1,0,3);
        pane.add(coffeeField,constraints.getConstraints());
        constraints.setPosition(1,1,3);
        pane.add(waterField,constraints.getConstraints());

    }

    public void setActionPerform(ArrayList<Thing> things)
    {
        ((Cup)things.get(0)).getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Sugar)things.get(1)).getButton().setEnabled(true);
                ((Coffee)things.get(2)).getButton().setEnabled(true);
                ((Teapot)things.get(3)).getButton().setEnabled(true);
            }
        });

        ((Sugar)things.get(1)).getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sugarField.setText("Сахар");
            }
        });

        ((Coffee)things.get(2)).getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeField.setText("Кофе");
            }
        });

        ((Teapot)things.get(3)).getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterField.setText("Вода");
            }
        });
    }

    public Container getPane()
    {
        return pane;
    }

    public Constraints getConstraints()
    {
        return constraints;
    }
}
