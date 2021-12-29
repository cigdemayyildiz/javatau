package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an adjective.");
        String adjective = scanner.nextLine();
        System.out.println("Please enter a season of the year.");
        String season = scanner.nextLine();
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+number+" cups of coffee.");
    }
}
