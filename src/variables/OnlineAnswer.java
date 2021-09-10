package variables;

public class OnlineAnswer {
    //TODO : in a web forum what would be the variables/properties be for an answer?

    String text ;
    String userName ;
    String dateEdited ;

    public OnlineAnswer(String text, String userName, String dateEdited) {
        this.text = text;
        this.userName = userName;
        this.dateEdited = dateEdited;
    }

    public OnlineAnswer(String text) {
        this.text = text;
    }

    public OnlineAnswer(String text, String userName) {
        this.text = text;
        this.userName = userName;
    }

    public void printOutContent(){
        System.out.println("Answer: " +text);
        System.out.println("Answer Was asked by: " + userName);
        System.out.println("Answer Was edited last on: " + dateEdited);

    }
}
