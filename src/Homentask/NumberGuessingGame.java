package Homentask;

import java.util.Scanner;

/*Create a game where the computer selects randomly a number in some range (0-100 for example) and you need to guess it.
 Using only if statements (no loops) create game that allows guessing until you manage to find the number.
 To allow for better guessing experience, let the user know if the guess was correct, and
 if the guess was larger or smaller than the thought of number, in case the number was not guessed correctly.
 For more of a challenge: count how many times the user tried to guess the number and show it at the end.
 */

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
