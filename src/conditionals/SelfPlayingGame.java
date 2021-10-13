package conditionals;

import java.util.Arrays;
import java.util.Random;

public class SelfPlayingGame {

    static Random ran;
    static int[] guessResults = new int[16];

    public static void main(String[] args) {

        ran = new Random();
        for (int i = 0; i < 900; i++) {
            createNewGame();

        }

        drawAHistogramVertically(guessResults, 900.0);
    }


    public static void createNewGame() {
        var game = new GuessGame(1, 100);
        int target = ran.nextInt(99)+1;
        gameStart(game, target);
    }

    public static void gameStart(GuessGame game, int target) {
        int previousGuess = -1;
        boolean continueGame = true;
        boolean wasbigger = true;
        while (continueGame) {

         //   previousGuess = game.generateAnewGuess(previousGuess, wasbigger);
            previousGuess =  game.generateATriangularNewGuess(previousGuess, wasbigger);
            wasbigger = previousGuess > target;
            continueGame = target != previousGuess;
        }
        System.out.println("guessed in :" + game.currentGuess + " , the number " + target);
        guessResults[game.currentGuess]++;
    }


    public static void drawAHistogramVertically(int[] input,double max) {
        System.out.println(Arrays.toString(input));
        int[] tries = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            tries[i] = (int) ((input[i]/max)*100);
        }
        System.out.println(Arrays.toString(tries));

        System.out.println("% guessed number in this many guesses:");
        System.out.print(" 0");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%10d",i*10);
        }
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%2d",i);
            for (int j = 0; j < tries[i]; j++) {
                System.out.print("|");
            }
            System.out.println();
        }

    }

    public static void drawAHistogramHorizontally(int[] input) {

    }
}
