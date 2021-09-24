package calculator;

import util.BirdRandomizer;
import variables.ReferenceVariables;

public class InitialCalculations {

    public static void main(String[] args) {

        System.out.println("A circles area with radius 2.3 is : " + Geometry.calculateCircleArea(2.3));
        var temporaryRandomNumber = 5 * Math.random();


        System.out.println(
            "A circles area with radius " + temporaryRandomNumber + " is : " + Geometry.calculateCircleArea(temporaryRandomNumber));

        int result = (temporaryRandomNumber > 3) ? 14 : 5;
        System.out.println("Result of the three operands action is: " + result);

        System.out.println("Surface : "+ surfaceAreaCyl(2.2,5.0));


        System.out.println(BirdRandomizer.returnRandomBird());
    }
    // ROUND them to int values
    // Group 1 - Ellipse area
    // Group 2 - Cube volume
    // Group 3 - Sphere volume
    // Group 4 - Surface area of cylinder

    public static int surfaceAreaCyl(double radius, double height) {
        return (int) Math.round(2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));
    }

}
