package util.hierarchy;
//created by Agris
public class Bird extends Animal {

    double height;
    double wingSpan;
    boolean canFly;
    boolean canSwim;
    String colour;

    public Bird(double height, double wingSpan, boolean canFly, boolean canSwim, String colour) {
        this.height = height;
        this.wingSpan = wingSpan;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bird{" +
            "height=" + height +
            "m, wingSpan=" + wingSpan +
            "m, canFly=" + canFly +
            ", canSwim=" + canSwim +
            ", colour='" + colour + '\'' +
            '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String makeSound() {
        return "Tweet";
    }
}
