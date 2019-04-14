package lab3;

import GUI.Window;
import Numbers.Expression;
import Numbers.Human;

public class Main {

    public static void main(String[] args) {
         Human human = new Human();
         Window window = new Window();
         Expression expression = new Expression();


        Controller controller = new Controller();
        controller.start(window, expression, human);
    }
}
