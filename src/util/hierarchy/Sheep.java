package util.hierarchy;

//created by Ausma

public abstract class Sheep extends Animal {


    int fleeceLength;
    double fleeceWeightInKg;
    String fleeceColour;
    boolean canJump;

    public Sheep (int fleeceLength, double fleeceWeightInKg, String fleeceColour, boolean canJump) {
        this.canJump = canJump;
        this.fleeceColour = fleeceColour;
        this.fleeceWeightInKg = fleeceWeightInKg;
        this.fleeceLength = fleeceLength;

    }

    public int getFleeceLength() {
        return fleeceLength;
    }

    public void setFleeceLength(int fleeceLength) {
        this.fleeceLength = fleeceLength;
    }

    public double getFleeceWeightInKg() {
        return fleeceWeightInKg;
    }

    public void setFleeceWeightInKg(double fleeceWeightInKg) {
        this.fleeceWeightInKg = fleeceWeightInKg;
    }

    public String getFleeceColour() {
        return fleeceColour;
    }

    public void setFleeceColour(String fleeceColour) {
        this.fleeceColour = fleeceColour;
    }

    @Override
    public String makeSound(){
        return "Beee..";
    }
}
