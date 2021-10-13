package util.hierarchy;

import java.util.Objects;
import java.util.StringJoiner;

public class Dog extends Animal {
    String name;
    double height;
    boolean canRun;
    boolean canSwim;
    String colour;

    public Dog(String name, double height, boolean canRun, boolean canSwim, String colour) {
        this.name = name;
        this.height = height;
        this.canRun = canRun;
        this.canSwim = canSwim;
        this.colour = colour;
    }


    @Override
    public String makeSound() {
        String result = "tjaf";
        if (height > 18) {
           result =  "Bark-bark!";
        }
        return result;

    }
}