package lab2;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        window.createAndShowWindow();
        Student student = new Student("Vasyan");
        student.makeCoffee(window.getPane());

    }
}
