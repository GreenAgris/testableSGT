package multiItems;

import java.util.Arrays;

public class IntroArrays {

    public static void main(String[] args) {
        int[ ] temperaturesArray = {16,20,21,23,23,12,76};
        int[ ] otherArray = Arrays.copyOf(temperaturesArray, temperaturesArray.length+3);
        int smallNumber = 13;
        int bigNumber = 783433;

        System.out.println(Arrays.toString(temperaturesArray));
        System.out.println(Arrays.toString(otherArray));

        smallNumber = bigNumber;
        bigNumber = bigNumber - 10;
        otherArray[3] = bigNumber;

        System.out.println("-------------");
        System.out.println(temperaturesArray);
        System.out.println(otherArray);


        System.out.println(Arrays.toString(temperaturesArray));
        System.out.println("temperatures: length-   " + temperaturesArray.length);

        System.out.println("-------------------");

        char[] heightLevelsArray = new char[ 10 ];
        boolean [] heightLevelsArray2 = new boolean[ 10 ];
        System.out.println(Arrays.toString(heightLevelsArray));
        System.out.println("heightLevels: length-   " + heightLevelsArray.length);
        System.out.println(Arrays.toString(heightLevelsArray2));
        System.out.println("heightLevels: length-   " + heightLevelsArray2.length);


        //!!!!!!!!!!!
        // numbering is starting from 0.
        //!!!!!!!!!!!
       // heightLevelsArray[3] = 33;
        System.out.println(Arrays.toString(heightLevelsArray));
        System.out.println("heightLevels: length-   " + heightLevelsArray.length);

        //BAD IDEA:
        System.out.println(" last Number in height Levels array  " + heightLevelsArray[heightLevelsArray.length-1]);

        System.out.println("-------------------");

        int[ ][ ] codingExampleArray = {{16,20,21,23,23,12,76}, {0,67,345,0,546,0,0,20,10},{116,210,231,243,253,152,796}, {1,3,5}};
        System.out.println(Arrays.toString(codingExampleArray));

        System.out.println(Arrays.deepToString(codingExampleArray));
        System.out.println("heightLevels: length-   " + codingExampleArray.length);
        System.out.println("heightLevels: width1-   " + codingExampleArray[0].length);
        System.out.println("heightLevels: width2-   " + codingExampleArray[1].length);

        System.out.println("-------------------");
        int[ ][ ] [ ]  crazyArray = {{{16,20,21,23,23,12,76}, {0,67,345,0,546,0,0,20,10}},{{116,210,231,243,253,152,796}, {1,3,5}}};
        System.out.println(Arrays.deepToString(crazyArray));
        System.out.println("heightLevels: length-   " + crazyArray.length);
        System.out.println("heightLevels: width-   " + crazyArray[0].length);
        System.out.println("heightLevels: height1-   " + crazyArray[0][0].length);
        System.out.println("heightLevels: height2-   " + crazyArray[0][1].length);
    }
}
