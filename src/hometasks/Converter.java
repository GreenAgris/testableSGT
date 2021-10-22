package hometasks;

/*Create a new class (name as you think is the best OR you can also use the ReferenceVariables class).
This class should hold 3 pre-defined variables that are the values to convert metric to imperial measurements.
This class should have a constructor( s) - generate them using InteliJ IDEA built in actions (right-click in class ->
generate -> constructor -> select fields for constructor -> ok) . Write functions that convert metrics.
They should just be public void and print out the results, each function receives a numeric value of the value
to be converted. In main method create the new class object with constructor passing the needed values,
call the conversion functions. If you want a bigger challenge - you can add more variables and functions conversions.
 */

public class Converter {
    double cm;
    double meters;
    double km;
    double inch;
    double ft;
    double yards;
    double mile;

    public Converter(double cm, double meters, double km) {
        this.cm = cm;
        this.meters = meters;
        this.km = km;
    }

    public void printOutConvertCmToYards() {
        System.out.println(cm + " cm = " + ( yards = cm / 0.9144 ) + " yards;");
    }

    public void printOutConvertCmToFeet() {
        System.out.println(cm + " cm = " + ( ft = cm / 30.48 ) + " ft;");
    }

    public void printOutConvertCmToInches() {
        System.out.println(cm + " cm = " + ( inch = cm / 2.54 ) + " inch;");
    }

    public void printOutConvertMetersToYards() {
        System.out.println(meters + " m = " + ( yards = meters / 0.9144 ) + " yards;");
    }

    public void printOutConvertMetersToFeet() {
        System.out.println(meters + " m = " + ( ft = meters / 0.3048 ) + " ft;");
    }

    public void printOutConvertMetersToInches() {
        System.out.println(meters + " m = " + ( inch = meters / 0.0254 ) + " inch;");
    }

    public void printOutConvertKilometerToMiles() {
        System.out.println(km + " km = " + ( mile = km / 1.60935 ) + " mile;");
    }
}
//If you want a bigger challenge - you can add more variables and functions conversions.


