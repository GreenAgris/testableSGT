package util.hierarchy;

// created by Anna

public class Frog extends Animal {


    boolean canSwim;
    boolean canJump;
    String colour;


    public Frog(boolean canSwim, boolean canJump, String colour) {

        this.canSwim = canSwim;
        this.canJump = canJump;
        this.colour = colour;

    }

    @Override
    public String toString() {
        return "Frog{" +
                "canSwim=" + canSwim +
                ", canJump=" + canJump +
                ", colour='" + colour + '\'' +
                '}';
    }


    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String makeSound() {
        return "kvaaa";
    }
}
