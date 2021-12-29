package chapter10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(105);
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }

    public void makeJuice(){
        System.out.println("Banana juice is gross \uD83E\uDD74");

    }
}
