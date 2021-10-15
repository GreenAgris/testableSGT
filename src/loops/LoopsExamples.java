package loops;

public class LoopsExamples {

    static int[] intArray = {16, 20, 21, 23, 23, 12, 71};
    static String[] exampleText = new String[]{"seastar", "Patrick", "Patrick seastar", "Omnitricks", "Omnibus", "Stellaris"};

    public static void main(String[] args) {
        System.out.println("Final result: " + sumInt(intArray));

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
        int theLargest = 0;
        for (int i = 0; i < input.length; i++) {
            if (theLargest < input[0]) {
                theLargest = input[0];
            }
            System.out.println("The largest number in the array is " + theLargest);
        }
        return theLargest;
    }

    public static int multiplyOnlyEvenNumbers(int[] input) {
        int multiplyNumbers = 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                multiplyNumbers = multiplyNumbers * intArray[i];
            }
            System.out.println("Multiplication of the even numbers in the array equals " + multiplyNumbers);
        }
        return multiplyNumbers;
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
        System.out.println("TODO");
    }

    public static void printOutCalculationTable(int minNumber, int maxNumber) {
        System.out.println("TODO");
    }

    public static String[] findSomethingInText(String search, String[] testText) {
        return new String[3];
    }


    //Complex exercises
    public static int findFirstPrimeNumber(int[] input) { // returns first found prime number or -1 if none are found
        return -1;
    }


}
