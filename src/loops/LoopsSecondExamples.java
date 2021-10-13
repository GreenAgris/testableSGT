package loops;

import java.util.Arrays;

public class LoopsSecondExamples {
    public static void main(String[] args) {
        int[] smallArray = {16, 21, 1, 23, 5};
        int[] intArray = {16, 20, 21, 23, 1, 23, 12, 71, 3, 44, 5};
        System.out.println(Arrays.toString(sortBubble(intArray)));
        System.out.println(digitSum(234561));
        System.out.println(Arrays.toString(sortBubble(smallArray)));

        findFibonacciNumbers(150);
    }

    // n = n-1 + n-2
    // 1 = 1
    // 2 = 1
    // 3 = 2
    // 4 = 3


    public static void findFibonacciNumbers(int max) {
        int first = 1;
        int second = 1;
        int active = 1;

        String output = first + "";
        while (active < max) {
            output += "; " + active;
            active = first + second;
            first = second;
            second = active;
        }
        System.out.println(output);
    }

    //Bubble sort
    // goes through the array -> each time one less element
    // each step compare 2 elements and make sure that the biggest one is "on the right"

    public static int[] sortBubble(int[] input) {
        int actions = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length - i; j++) {
                //value = count the digits
                // 16 = 7
                // 21 = 3
                if (digitSum(input[j]) < digitSum(input[j - 1])) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                    actions++;
                }
            }
        }
        System.out.println("Switch actions done on elements: " + actions);
        return input;
    }

    //2147
    public static int digitSum(int input) {
        int placeholder = input % 10;// 7
        while (input > 0) {
            input = input / 10;//214
            placeholder += input % 10;
        }
        return placeholder;
    }

}
