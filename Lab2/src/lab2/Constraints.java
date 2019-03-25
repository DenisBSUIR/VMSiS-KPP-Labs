package lab2;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Container;

public class Constraints {
    private GridBagConstraints constraints = new GridBagConstraints();
    public Constraints(Container pane) {
        pane.setLayout(new GridBagLayout());
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1;
    }

    public GridBagConstraints getConstraints() {
        return constraints;
    }

    public void setPosition (int width, int x, int y) {
        constraints.gridwidth = width;
        constraints.gridx = x;
        constraints.gridy = y;
    }
}
