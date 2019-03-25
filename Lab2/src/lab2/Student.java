package lab2;
//import java.awt.Container;
import java.util.ArrayList;


public class Student {
    private String name = new String();
    private ArrayList<Thing> things = new ArrayList<>();

    public Student(String name)
    {
        this.name.concat(name);
    }

    public ArrayList<Thing> getThings()
    {
        return things;
    }

    public void makeCoffee(MyPane pane) {
        Cup cup = new Cup();
        cup.addToPane(pane);
        things.add(cup);

        Sugar sugar = new Sugar();
        sugar.addToPane(pane);
        sugar.pour((Cup) things.get(0));
        things.add(sugar);

        Coffee coffee = new Coffee("3v1");
        coffee.addToPane(pane);
        coffee.pour((Cup) things.get(0));
        things.add(coffee);

        Teapot teapot = new Teapot();
        teapot.addToPane(pane);
        teapot.fillWithWater();
        teapot.pour((Cup) things.get(0));
        things.add(teapot);

        pane.addJLabelFields();
        pane.setActionPerform(things);
    }
}
