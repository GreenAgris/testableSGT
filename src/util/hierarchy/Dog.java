package util.hierarchy;

public class Dog extends Animal {
    double height;
    double canBark;
    boolean canBite;
    boolean canSwim;
    String colour;
    String name;

    public Dog(double height, double canBark, boolean canBite, boolean canSwim, String colour, String name) {
        this.height = height;
        this.canBark = canBark;
        this.canBite = canBite;
        this.canSwim = canSwim;
        this.colour = colour;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", canBark=" + canBark +
                ", canBite=" + canBite +
                ", canSwim=" + canSwim +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
