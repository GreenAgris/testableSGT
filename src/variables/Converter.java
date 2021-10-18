package variables;

//create a conversion from cm to inches, cm to foot. Meters to yards.
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


