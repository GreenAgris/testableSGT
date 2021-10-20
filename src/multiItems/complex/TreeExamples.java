package multiItems.complex;


import java.util.ArrayList;
import java.util.List;
import util.TreeNode;

public class TreeExamples {


    public static void main(String[] args) {

        System.out.println(bioTree().toString());

    }


    private static TreeNode bioTree() {

        TreeNode dog = new TreeNode("Dog", new ArrayList<>());
        TreeNode jackal = new TreeNode("Jackal", new ArrayList<>());
        TreeNode canidae = new TreeNode("Canidae", List.of(dog, jackal));

        TreeNode spoSkunk = new TreeNode("Spotted skunk", new ArrayList<>());
        TreeNode stripedSkunk = new TreeNode("Striped skunk", new ArrayList<>());
        TreeNode mephitidae = new TreeNode("Mephitidae", List.of(spoSkunk, stripedSkunk));
        TreeNode root = new TreeNode("Caniformia", List.of(mephitidae, canidae));
        TreeNode animals = new TreeNode("Animals", List.of(root));
        return animals;
    }


}
