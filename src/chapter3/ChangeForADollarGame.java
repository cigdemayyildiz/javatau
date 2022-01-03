package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;

        System.out.println("Welcome to 'Change for a Dollar'!" + "\nYour goal is to enter enough to make exactly $1.00");

        System.out.print("Enter your number of pennies: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();
        System.out.print("Enter your number of nickels: ");
        int numberOfNickels = scanner.nextInt();
        System.out.print("Enter your number of dimes: ");
        int numberOfDimes = scanner.nextInt();
        System.out.print("Enter your number of quarters: ");
        int numberOfQuarters = scanner.nextInt();
        scanner.close();

        double total = numberOfPennies*penny + numberOfNickels*nickel + numberOfDimes*dime + numberOfQuarters*quarter;

        if (total < dollar){
            double shortOfAmount = dollar - total;
            System.out.println("Sorry, you lost! You were short " + String.format("%.2f", shortOfAmount) + " cents.");
        }else if (total > dollar){
            double overOfAmount = total - dollar;
            System.out.println("Sorry, you lost! You were over " + String.format("%.2f", overOfAmount) + " cents.");
        }else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
