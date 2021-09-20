package conditionals;

import java.util.Scanner;

public class NumberGuessingGame {

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        sayHello();
        gameStart();
    }

    public static void sayHello() {

        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    public static void gameStart() {
        System.out.println("I have a game for you. I have imagined a number [0 -> 100], can you guess it?");
        long number = Math.round(Math.random() * 100);

        askForNumber(number, 0);
    }

    public static void askForNumber(long number, int times) {
        System.out.println("Please write in your guess:");
        double guessedNumber = scanner.nextDouble();
        boolean isNumberGuessed = Math.round(guessedNumber) == number;

        System.out.print("Your guess was: ");
        if (isNumberGuessed) {
            System.out.println("correct! Congratulations! You did it in " + times + " tries!");
        } else {
            System.out.println("incorrect!");
            String comparisonResult = guessedNumber < number ? "smaller" : "larger";
            System.out.println("Your guessed number was " + comparisonResult + " then the number I chose");
            askForNumber(number, ++times);
        }

    }
}
