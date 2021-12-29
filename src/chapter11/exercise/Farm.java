package chapter11.exercise;

public class Farm {

    public static void main(String[] args) {

        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Pig porky = new Pig();
        porky.makeSound();

        Animal donald = new Duck();
        donald.makeSound();
        donald.eat();

        Duck daffy = new Duck();
        daffy.makeSound();

    }



}
