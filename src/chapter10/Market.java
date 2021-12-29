package chapter10;

public class Market {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.removeSeeds(); // Apple seeds removed
        apple.makeJuice(); // Apple juice is my favorite 🥃

        Banana banana = new Banana();
        banana.peel(); // Banana has been peeled
        banana.makeJuice(); // Banana juice is gross 🥴

        Fruit apple1 = new Apple();
        apple1.makeJuice(); // Apple juice is my favorite 🥃
        ((Apple) apple1).removeSeeds(); // Apple seeds removed

        Fruit banana1 = new Banana();
        banana1.makeJuice(); // Banana juice is gross 🥴
        ((Banana) banana1).peel(); // Banana has been peeled

        Fruit orange = new Fruit();

        squeeze(apple); // Squeezing...Apple juice is my favorite 🥃
        squeeze(apple1); // Squeezing...Apple juice is my favorite 🥃
        squeeze(banana); // Squeezing...Banana juice is gross 🥴
        squeeze(banana1); // Squeezing...Banana juice is gross 🥴
        squeeze(orange); // Squeezing...Juice is made

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();

    }

}
