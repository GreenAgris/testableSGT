package variables;

public class OnlineQuestion {
    //TODO : in a web forum what would be the variables/properties be for a question?
    String text = "I'm looking for the fastest way to determine if a long value is a perfect square (i.e. its square root is another integer):";
    short score = 1538;
    String userName = "Kim";
    String dateEdited = "Oct 29 19 at 17:00";
    // arrays  &  list labels

    OnlineAnswer answer2 = new OnlineAnswer("text1", "text2");

    OnlineAnswer answer = new OnlineAnswer("Some answered here", "TestUser","Aug 29 21 at 20:14");

    public void printOutContent(){
        System.out.println(text);
        System.out.println("Was asked by: " + userName);
        System.out.println("Was edited last on: " + dateEdited);

        answer.printOutContent();

    }
}
