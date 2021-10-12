package conditionals;

import util.hierarchy.Bird;
import util.BirdRandomizer;

/*Create A bird recognition program, based on previous given util-> Bird class.
Using an if-else conditional chain determine what kind of bird it might be
(4 original birds given are Emu, Swan, Stork and Penguin) and create an output.
Output creation should be done with another function and using switch structure.
Print out some interesting bird facts about the detected bird.
Add a fifth (or more) bird type and see how the detection changes.
Check if you can optimise your if-else statements.
 */

public class BirdSelector {

    public static void main(String[] args) {

    Bird randomBird = BirdRandomizer.returnRandomBird();

        randomBird.getAge();


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
