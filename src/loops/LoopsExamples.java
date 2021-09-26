package loops;

import static util.MathHelpers.isPrime;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LoopsExamples {

    int[] intArray = {16, 20, 21, 23, 23, 12, 71};
    String[] exampleText = new String[]{"seastar", "Patrick", "Patrick seastar", "Omnitricks", "Omnibus", "Stellaris"};

    public static void main(String[] args) {

    }

    public static int sumInt(int[] input) {
        return Arrays.stream(input).sum();
    }

    public static int findLargest(int[] input) {
        return Arrays.stream(input).max().getAsInt();
    }

    public static int multiplyOnlyEvenNumbers(int[] input) {
        return Arrays.stream(input).filter(element -> element % 2 == 0).reduce(1, Math::multiplyExact);
    }

    //Advanced exercises
    //printOutCalculationTable(4)should create output on screen like:
    //   1  2  3  4
    //1  1  2  3  4
    //2  2  4  6  8
    //3  3  6  9  12
    //4  4  8  12  16
    //System.out.printf("%4d",number); will come in handy here - it formats more neatly and does not insert a new line
    public static void printOutCalculationTable(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void printOutCalculationTable(int minNumber, int maxNumber) {
        for (int i = minNumber; i <= maxNumber; i++) {
            for (int j = minNumber; j <= maxNumber; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static String[] findSomethingInText(String search, String[] testText) {
        var initial = Arrays.stream(testText).filter(element -> element.contains(search)).collect(Collectors.toList());
        String[] array = new String[initial.size()];
        return initial.toArray(array);
    }


    //Complex exercises
    public static int findFirstPrimeNumber(int[] input) { // returns first found prime number or -1 if none are found
        return Arrays.stream(input).filter(element -> isPrime(element)).findFirst().orElse(-1);
    }


}
