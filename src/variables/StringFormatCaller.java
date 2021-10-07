package variables;

public class StringFormatCaller {
    public static void main(String[] args) {
        System.out.println(StringFormattingExamples.americanStyleTimeString(23, 43));

        StringFormattingExamples.letterHist("Some Nice confusing Text that can be an input, for creating a histogram, It even can ignore somē būgs!");

        String longerDateText = "some text at 2021-10-25T23:49 will be sent for our people, to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled.";
        StringFormattingExamples.findAndPrintDatesFromText(longerDateText);

        String[] passwords = {"Dogcatchers", "d0gsaremybestfr13nds", "C@ts-and-Dogs-Living-together", ".Susa53", "d3ltagamm@",
            "BankLogin13", "BankLogin!3"};
        StringFormattingExamples.passwordCheck(passwords);


    }
}
