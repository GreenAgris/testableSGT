package hometask;

import java.util.Arrays;
import java.util.Random;

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

    public static int[] createArray() {
        Random rd = new Random(); // creating Random object
        int[] intArray = new int[10];
        for ( int i = 0; i < intArray.length; i++ ) {
            intArray[i] = rd.nextInt(100); //Generates array randomly - max element value - 100
        }
        System.out.println("Generated random array: " + Arrays.toString(intArray));
        return ( intArray );
    }

    public static void calculatePercentage(int[] input) {
        int sum = 0;
        for ( int k : input ) sum += k;    //calculating sum of array elements
        System.out.println("Sum of all array elements = " + sum);
        int percentageArray[] = new int[input.length];  //creating new array with the same length
        for ( int j = 0; j < input.length; j++ )
            percentageArray[j] = input[j] * 100 / sum;      //filling it with a new value - percentages
        System.out.println("Our array is transformed to % value: " + Arrays.toString(percentageArray));
        System.out.println(String.format("%n" + "                              -//- HISTOGRAM OF PERCENTAGE VALUE -//- %n" + "%n" +
                "         0         10        20        30        40        50        60        70        80        90       100"));
        for ( int i = 0; i < percentageArray.length; i++ ) {
            System.out.print(i + ".element ");
            while
            (percentageArray[i] > 0) {
                percentageArray[i] -= 1;
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        calculatePercentage(createArray().clone()); //in our function we do use array that is equal to the generated array
    }
}








