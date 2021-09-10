package variables;

import static util.Color.GREEN;
import static util.Color.PURPLE;
import static util.Color.RED;
import static util.Color.WHITE_BOLD;
import static util.Color.YELLOW_UNDERLINED;

public class FollowUpVariables {

    public static void main(String[] args) {
        // some variables to set up, since they are all short, we can save some space!
        //TODO task 0 - warmup, initialize (or give some values) to the variables below
        short age= 34, size = 43, lengthInCm = 10;

        double growthMetric = 12.3, heightInMeters= 12.3, averageAge = 45.7;

        // ALWAYS the name is on the left side of the value declaration. We can not do as in math 32 = f, because in Java that won't make any sense!
        float f1 = 32e3f;
        // even if we want to add some values or Initialize the variables on declaration, it is possible, if they are the same type!
        double d1 = 314E2d, d2 = 5.8E6d;

        System.out.println(RED + f1);
        System.out.println(PURPLE + d1);
        System.out.println(d2);
        System.out.println("Math action sequence is used in programming! So (2 + 4 / 2 ) is =  " + (2 + 4 / 2) + "    and not 3!");
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        // there is a reason to be very careful with some number data types and why they should not be used for financial calculations
        // - there are some better non-primitive data types to do that!
        System.out.println(GREEN + " ---  Task Results Start Here    ---- ");
        int hour = 11;
        int minutes = 59;
        System.out.println("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minutes); // Reminder that expressions are evaluated before executing the function

        System.out.println("Fraction of the hour that has passed: ");
        System.out.println(minutes / 60); // will be a bit surprising, but if you check the type, you can guess why the result is at it is
        // TODO task 1: fix the previous line of code so it shows the expected result of 0.9833333333333333...
        // TODO task 2: fix the previous line of code so it shows the expected result of 0.9833333333333333... WITHOUT changing the existing variables

        System.out.println(minutes / 60.0);
        System.out.println(minutes / 60d);
        System.out.println((double)minutes / 60);


        double resultOfDivision = 1.0 / 3d;
        // TODO task 3: set the value of resultOfDivision so we get a correct value in the print out:
           System.out.println("Fraction of one-third is: " + resultOfDivision);

        System.out.println(YELLOW_UNDERLINED + " ---  Task About Action Order Start Here    ---- ");
        // TODO task 4: set the value of next fraction so we get a value of 98:
        System.out.println("next fraction should be 98! : " + (100 / 60 * minutes));
        System.out.println("next fraction should be 98! : " + ( minutes * 100 / 60 ));
        System.out.println("next fraction should be 98! : " + (int)( minutes * 100.0 / 60 )); // 98.333333

        // TODO task 5: create a conversion from cm to inches (already given as an example) , cm to foot. Meters to yards.
        // ! create any new variables that you need and choose names that are clear for them ! You can use https://en.wikipedia.org/wiki/Imperial_units#Length as a source of conversion numbers
        System.out.println(WHITE_BOLD + " ---  Task About Conversion of units Start Here    ---- ");

        int inch = 1; // for testing you can change the values as needed
        double cm;
        cm = inch * 2.54; // hint : this might need 2 updates
        System.out.println(inch + " in = ");
        System.out.println(cm + " cm");

        double ft = cm / 30.48;
        System.out.println(cm + " cm = ");
        System.out.println(ft + " ft");
        double yards = 0.9144 * heightInMeters;
        //heightInMeters
        System.out.println(heightInMeters + " meters = ");
        System.out.println(yards + " yards");
    }


}
