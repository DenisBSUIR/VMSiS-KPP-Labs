package lab3;

import GUI.Window;
import Numbers.Expression;
import Numbers.Human;

public class Controller {

    public void start(Window window, Expression expression, Human human){
        window.createAndShowWindow();
        window.setStartWindow();
        window.getPane().setActionPerform(window, expression, human);
    }
}
