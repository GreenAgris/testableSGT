package util.hierarchy;

// Created by Vija
//CREATE TABLE Dog (
//	name TEXT NOT NULL,
//	height INTEGER DEFAULT 62 NOT NULL,
//	canRun NUMERIC DEFAULT 1,
//	id INTEGER PRIMARY KEY AUTOINCREMENT
//);

import java.util.StringJoiner;

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
    public String toString() {
        return new StringJoiner(", ", Dog.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("height=" + height)
                .add("canRun=" + canRun)
                .toString();
    }

    @Override
    public String makeSound() {
        String result = "tjaf";
        if (height > 18) {
            result = "Bark-bark!";
        }
        return result;

    }

    public static void main(String[] args) {
        Dog dave = new Dog("Dave", 62,true,true,true,"brown");
        System.out.println(dave.makeSound());
    }


}
