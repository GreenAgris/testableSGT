package guessing_game;

import java.util.Scanner;

public class GuessingGame {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        sayHello();

        askForNumber();
    }

    public static void sayHello() {
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println ("Hello,"+ name);

    }

    public static void askForNumber() {
        System.out.println("I have a game for you. I have a number[0 -> 100], can you guess it? ");
        long number = Math.round(Math.random() * 100);
        long guessedNumber = scanner.nextLong();
        boolean isNumberGuessed = guessedNumber == number;
        System.out.println("I chose the number - " + number);
        System.out.println("You guessed the number:" + isNumberGuessed);

        if (isNumberGuessed) {
            System.out.println("You won!");
        } else {
            if (guessedNumber < number) {
                System.out.println("Your guessed number is smaller than my number");
            } else {
                if (guessedNumber > number){
                    System.out.println("Your guessed number is larger than my number");
                }

            }
            System.out.println("can you guess it?");
            guessedNumber = scanner.nextLong();
            isNumberGuessed = Math.round(guessedNumber) == number;
            System.out.println("You guessed the number: " + isNumberGuessed);
        }
    }


}



