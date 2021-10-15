package introduction;

import java.util.Arrays;
import util.hierarchy.Animal;
import util.hierarchy.Bird;
import util.hierarchy.Cat;
import util.hierarchy.Dog;
import util.hierarchy.Frog;
import util.hierarchy.Penguin;
import util.hierarchy.Sheep;

public class SomeClassIntroduction {

    public static void main(String[] args) {

        Animal[] zoo = new Animal[10];
        Bird bird = new Bird(1.5, 1.44, false, false, "Black");
        Penguin penguin = new Penguin(0.35, 0.44, false, true, "Black/White", 32.0);
        Cat cat = new Cat(true, "Tabby", "mixed");
        Dog dog = new Dog("Dave", 62, true, true, true, "brown");
        Sheep sheep = new Sheep(3, 30.0, "White", true);
        Frog frog = new Frog(true, true, "Light-Green");


        zoo[0] = bird;
        zoo[1] = penguin;
        zoo[2] = cat;
        zoo[3] = dog;
        zoo[4] = sheep;
        zoo[5] = frog;

        System.out.println(Arrays.toString(zoo));
        System.out.println(bird.makeSound());
        System.out.println(penguin.makeSound());
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(sheep.makeSound());
        System.out.println(frog.makeSound());
    }
}

