package introduction;


import variables.OnlineQuestion;

public class Initial {

    public static void main(String args[]) {
        System.out.println("Hello, world, from Agris");

        OnlineQuestion someQuestion = new OnlineQuestion();
        someQuestion.printOutContent();
        System.out.println("and Anna Beatrise");

        for (String s: args) {
            System.out.println(s);
        }

    }

}
