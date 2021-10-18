package multiItems;

import java.util.ArrayList;
import util.hierarchy.Animal;
import util.hierarchy.Bird;
import util.hierarchy.Cat;
import util.hierarchy.Dog;
import util.hierarchy.Penguin;
import util.hierarchy.Sheep;

public class IntroOtherCollections {

    public static void main(String[] args) {

        Bird bird = new Bird(1.5, 1.44, false, false, "Black");
        Penguin penguin = new Penguin(0.35, 0.44, false, true, "Black/White", 32.0);
        Cat cat = new Cat(true, "Tabby", "mixed");
        Dog dog = new Dog("Dave", 62, true, true, true, "brown");
        Sheep sheep = new Sheep(3, 30.0, "White", true);


        ArrayList<Animal> arrlist = new ArrayList<>();
        arrlist.add(bird);
        arrlist.add(cat);
        arrlist.add(penguin);

        for (Animal animal : arrlist){
            System.out.println(animal.makeSound());
        }
    }
}
