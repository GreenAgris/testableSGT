package variables;

import static util.Color.CYAN;
import static util.Color.WHITE_BOLD;

public class ReferenceVariables { //If needed, you can use this as the base class for Homework

    private static double inchToCm = 2.54;
    private static double cmToFeet = 30.48;
    private static double yardsToMeters = 0.9144;

    public static void main(String[] args) {
        int inch = 3; // for testing you can change the values as needed
        double cm = 7.62;
        double meters = 3.2;

        System.out.println(WHITE_BOLD + " ---  Task About Conversion of units Start Here    ---- ");

        convertInchToCm(inch);

        System.out.print(cm + " cm = ");
        System.out.println(convertCmToFeet(cm) + " ft");

        System.out.print(meters + " meters = ");
        System.out.println(convertMetersToYards(meters) + " yards");

        System.out.println(CYAN + " ---  Task About Conversion of units continues with reverse conversions   ---- ");

        System.out.print(cm + " cm =  ");
        System.out.println(convertCmToInch(cm) + " inches");

        System.out.print("22.0 feet =  ");
        System.out.println(convertFeetToCm(22.0) + " cm");

        System.out.print("12 yards =  ");
        System.out.println(convertYardsToMeters(12.0) + " meters");

    }


    public static void convertInchToCm(int inches) {
        System.out.print(inches + " in =  ");
        System.out.println(inches * inchToCm + " cm");
    }

    public static double convertCmToFeet(double cm) {
        return cm / cmToFeet;
    }

    public static double convertMetersToYards(double meters) {
        return yardsToMeters * meters;
    }

    /// --------- additional conversions
    public static double convertCmToInch(double cm) {
        return cm / inchToCm;
    }

    public static double convertFeetToCm(double feet) {
        return feet * cmToFeet;
    }

    public static double convertYardsToMeters(double yards) {
        return yards / yardsToMeters;
    }
}
