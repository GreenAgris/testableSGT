package util.hierarchy;

public class Penguin extends Bird {

    double internalTemperature;
    double swimmingInKMPerHour;

    public Penguin(double height, double wingSpan, boolean canFly, boolean canSwim, String colour) {
        super(height, wingSpan, canFly, canSwim, colour);
        internalTemperature = 25.7;
        swimmingInKMPerHour = 0.0;
    }

    public Penguin(double height, double wingSpan, boolean canFly, boolean canSwim, String colour, double internalTemperature ) {
        super(height, wingSpan, canFly, canSwim, colour);
        this.internalTemperature = internalTemperature;
        swimmingInKMPerHour = 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + " and temperature: " + internalTemperature;
    }
}
