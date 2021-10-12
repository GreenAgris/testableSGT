package loops;

import java.util.Arrays;

public class Histogram {
    /* Write a histogram (vertical) based on the following approach:
     The incoming data should be organized as an array of numbers.
     Convert the numbers in array to the percentages, by summing all the values in the array and
     each element in array setting a new value as ({value of element} / {total sum of all elements})*100.
     Set up a description of what is shown and one of the axis as the first line(s).
     For each element of the input array, print out the index of the element and corresponding number of characters
     representing the percentage value. The output values showing percentages are consistent with the first
     line printed axis values. For convinience the percentage numbers should be rounded to whole numbers.
     */
    static int[] intArray = {10, 2, 2, 56, 6, 4, 70, 0, 30, 20};

    public static void printPercentage(int[] input) {
        int sum = 0;
        for ( int i = 0; i < input.length; i++ )
            sum += input[i];    //calculating sum of array elements
        System.out.println("sum = " + sum);
        int percentageArray[] = new int[input.length];  //creating new array with the same length
        for ( int j = 0; j < input.length; j++ )
            percentageArray[j] = input[j] * 100 / sum;      //filling it with a new value - percentages
    System.out.println(Arrays.toString(percentageArray));
    }

    public static void main(String[] args) {
        printPercentage(intArray);
    }

}







