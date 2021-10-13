package util;

import java.util.ArrayList;
import java.util.List;
import util.hierarchy.Bird;

public class BirdRandomizer {

   static public List<Bird> birds = new ArrayList<Bird>(List.of(
   new Bird(1.5,3.1,true, true, "White"), // swan
       new Bird(0.35,0.44,false, true, "Black/White"), //penguin
       new Bird(1.5,1.44,false, false, "Black"), //emu
       new Bird(1.3,2.02,true, false, "White"), //stork
       new Bird(1.3,2.8,true, true, "White"), //swan2
       new Bird(0.33,0.45,false, true, "Black/White"), //penguin2
       new Bird(1.75,2.5,false, false, "Black"), //emu2
       new Bird(1.9,2.28,true, false, "White")  //stork2
   ));

   public static Bird returnRandomBird(){
       return birds.get((int)(Math.random()*8));
   }
}
