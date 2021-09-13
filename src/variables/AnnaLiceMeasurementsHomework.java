package variables;

public class AnnaLiceMeasurementsHomework {
    double cm;
    double kg;

    double l;
    public AnnaLiceMeasurementsHomework (double cm, double kg, double l) {
        this.cm = cm;
        this.kg = kg;
        this.l = l;

    }

    public void printToImperial() {
        double inch = cm / 2.54;
        System.out.println("inches =  " + inch);

        double lb = kg * 2.2046;
        System.out.println ("lb = " + lb);

        double gallon = l * 4.546;
        System.out.println ("gallon =" + gallon);
    }

    public static void main(String[] args) {
        AnnaLiceMeasurementsHomework first = new AnnaLiceMeasurementsHomework(3, 4, 8);
        first.printToImperial();
    }
}
