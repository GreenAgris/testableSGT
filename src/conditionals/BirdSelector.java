package conditionals;

import util.Bird;
import util.BirdRandomizer;

public class BirdSelector {

    public static void main(String[] args) {

    Bird randomBird = BirdRandomizer.returnRandomBird();

        if (randomBird.getColour().equals("Black")){
        System.out.println("It should be an emu");
    }else if (randomBird.getColour().equals("Black/White")){
        System.out.println("It should be a penguin");
    }else{
        if (randomBird.isCanSwim()){
            System.out.println("It should be a swan");
        }else {
            System.out.println("It should be a stork");
        }
    }
        System.out.println(randomBird);
}
}
