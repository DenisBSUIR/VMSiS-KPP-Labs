package Numbers;

public class Human {

    private String name;

    public void calculateResult(Expression expression) {
        expression.calculate();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
