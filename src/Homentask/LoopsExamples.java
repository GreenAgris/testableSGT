package Homentask;

import java.util.Arrays;

public class LoopsExamples {


    static int[] intArray = {16, 20, 21, 9, 12, 14, 22, 23, 7};


    static String[] exampleText = new String[]{"seastar", "Patrick", "Patrick seastar", "Omnitricks", "Omnibus", "Stellaris"};

    public static void main(String[] args) {
        System.out.println("Final sum result: " + sumInt(intArray));
        System.out.println("");
        System.out.println("Final largest number: " + findLargest(intArray));
        System.out.println("");
        System.out.println("Final multiply even numbers result: " + multiplyOnlyEvenNumbers(intArray));
        System.out.println("");
        System.out.println(findSomethingInText("Omni", exampleText));
        System.out.println("First prime number in array or -1: " + findFirstPrimeNumber(intArray));

    }

    public static int sumInt(int[] input) {
        int sumOfArray = 0;
        for ( int element : input ) {
            sumOfArray += element;
            System.out.println("Current sum : " + sumOfArray);
        }
        return sumOfArray;
    }


    public static int findLargest(int[] input) {
        int largestNumber = intArray[0];
        for ( int element : input ) {
            if (element > largestNumber) {
                largestNumber = element;
            }
            System.out.println("Largest number : " + largestNumber);
        }
        return largestNumber;
    }


    public static int multiplyOnlyEvenNumbers(int[] input) {
        int result = 1;
        for ( int element : input ) {
            if (element % 2 == 0) {
                result = result * element;
            }
            System.out.println("Multiply even numbers result : " + result);
        }
        return result;
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
        for ( int i = 1; i <= maxNumber; i++ ) {
            for ( int j = 1; j <= maxNumber; j++ ) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void printOutCalculationTable(int minNumber, int maxNumber) {
        for ( int i = minNumber; i <= maxNumber; i++ ) {
            for ( int j = minNumber; j <= maxNumber; j++ ) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static String[] findSomethingInText(String search, String[] testText) {
        String[] newText = new String[0];
        for ( String element : testText ) {
            if (element.contains(search)) {
                newText = Arrays.copyOf(newText, newText.length + 1);
                newText[newText.length - 1] = element;
            }
            System.out.println(Arrays.toString(newText));
        }

        return newText;
    }


    //Complex exercises
    public static int findFirstPrimeNumber(int[] input) { // returns first found prime number or -1 if none are found
        int result = -1;
        for ( int i = 0; i < input.length; i++ ) {
            boolean prime = true;
            for ( int j = 2; j < input[i]; j++ ) {
                if (input[i] % j == 0) {
                    prime = false;
                }
            }

            if (prime) {
                result = input[i];
                break;

            }
        }
        return result;
    }

}
