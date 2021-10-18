package introduction;

import util.hierarchy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SomeClassIntroduction {

    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();
        Bird bird = new Bird(1.5, 1.44, false, false, "Black");
        Penguin penguin = new Penguin(0.35, 0.44, false, true, "Black/White", 32.0);
        Cat cat = new Cat(true, "Tabby", "mixed");
        Dog dog = new Dog("Dave", 62, true, true, true, "brown");
        Sheep sheep = new Sheep(3, 30.0, "White", true);

        zoo.add(bird);
        zoo.add(penguin);
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(sheep);

        System.out.println("**************");
        System.out.println(Arrays.toString(zoo.toArray()));
        System.out.println("**************");


        System.out.println(zoo.size());

        zoo.remove(0);

        for (Animal animal : zoo){
            System.out.println(animal.makeSound());
        }

        HashMap<String, Animal> rivalZoo = new HashMap<>();


        rivalZoo.put("Tweety",bird);
        rivalZoo.put("Frosty",penguin);
        rivalZoo.put("Felix",cat);
        rivalZoo.put("Barky",dog);
        rivalZoo.put("Molly",sheep);

        System.out.println(rivalZoo.size());

        for (String key : rivalZoo.keySet()){
            System.out.println(rivalZoo.get(key) +"    "+ rivalZoo.get(key).makeSound());
        }

    }
}

