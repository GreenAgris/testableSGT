package calculator;

public class InitialCalculations {

    public static void main(String[] args) {

        System.out.println("A circles area with radius 2.3 is : " + Geometry.calculateCircleArea(2.3));
        var temporaryRandomNumber = 5 * Math.random();


        System.out.println(
            "A circles area with radius " + temporaryRandomNumber + " is : " + Geometry.calculateCircleArea(temporaryRandomNumber));

        int result = (temporaryRandomNumber > 3) ? 14 : 5;
        System.out.println("Result of the three operands action is: " + result);
    }
    // ROUND them to int values
    // Group 1 -   Elipse area
    // Group 2 - cube volume
    // Group 3 -    sphere volume
    // Group 4 - surface area of cilynder

// ohnfsoding
}
