package loops;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopsExamples {

    static int[] intArray = {16, 20, 21, 23, 23, 12, 71};


    static String[] exampleText = new String[]{"seastar", "Patrick", "Patrick seastar", "Omnitricks", "Omnibus", "Stellaris"};

    public static void main(String[] args) {
        System.out.println("Final result: " + sumInt(intArray));
        System.out.println(Arrays.toString(findSomethingInText("star", exampleText)));
    }

    public static int sumInt(int[] input) {
        int sumOfArray = 0;
        for (int element : input) {
            sumOfArray += element;
            System.out.println("Current sum : " + sumOfArray);
        }
        return sumOfArray;
    }


    public static int findLargest(int[] input) {
        int tempMax = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > tempMax) {
                tempMax = input[i];
            }
        }
        return tempMax;
    }

    public static int multiplyOnlyEvenNumbers(int[] input) {
        int sum = 0;
        boolean firstTry = true;
        for (int i = 0; i < input.length; i++) {
            if ((input[i]) % 2 == 0) {
                if (firstTry) {
                    sum = input[i];
                    firstTry = false;
                    continue;
                }
                sum *= input[i];
            }
        }
        return sum;
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

    public static void printTriangularCalculationTable(int maxValue) {
        for (int i = 1; i <= maxValue; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static String []findSomethingInText(String search, String[] testText) { //testText[1].contains(search);
        ArrayList<String> newArrayList = new ArrayList<String>();
        for (int i = 0; i < testText.length; i++) {
            if (testText[i].contains(search)) {
                newArrayList.add(testText[i]);
            }
        }

        String newArray[] = new String[3];
        newArray = newArrayList.toArray(newArray);
        return newArray;
    }


    //Complex exercises
    public static int findFirstPrimeNumber(int[] input) { // returns first found prime number or -1 if none are found
        int firstPrime = 0;
        boolean isPrime = true;
        for (int i = 0; i < input.length; i++) {
            System.out.println("i = " + i);
            if (input[i] >= 2) {
                for (int j = 2; j <= input[i] / 2; j++) {
                    if (input[i] % j == 0) {
                        isPrime = false;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    firstPrime = input[i];
                    break;

                } else {
                    firstPrime = -1;
                }
            }
        }
        return firstPrime;
    }
}
