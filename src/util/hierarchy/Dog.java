package util.hierarchy;

// Created by Vija

public class Dog extends Animal {
    String name;
    double height;
    boolean canRun;
    boolean canSwim;
    boolean canBite;
    String colour;

    public Dog(String name, double height, boolean canRun, boolean canSwim, boolean canBite, String colour) {
        this.name = name;
        this.height = height;
        this.canRun = canRun;
        this.canSwim = canSwim;
        this.canBite = canBite;
        this.colour = colour;
    }


    @Override
    public String makeSound() {
        String result = "tjaf";
        if (height > 18) {
            result = "Bark-bark!";
        }
        return result;

    }
}
