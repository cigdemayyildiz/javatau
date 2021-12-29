package chapter5;

import java.util.Scanner;

/*
 * Our First Method
 * Write a method that asks an user for their name, then greets them by name.
 */
public class Greetings {

    public static void main(String[] args) {

        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        greetUser(name);

    }

    public static void greetUser(String name){
        System.out.println("Hi there, "+name);
    }
}
