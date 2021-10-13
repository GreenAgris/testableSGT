package variables;

import java.util.Arrays;

public class StringFormatCaller {

    public static void main(String[] args) {
        System.out.println(StringFormattingExamples.americanStyleTimeString(23, 43));

/*        StringFormattingExamples.letterHist(
            "Some Nice confusing Text that can be an input, for creating a histogram, It even can ignore somē būgs!");

        String longerDateText = "some text at 2021-10-25T23:49 will be sent for our people, to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled.";
        StringFormattingExamples.findAndPrintDatesFromText(longerDateText);

        String[] passwords = {"Dogcatchers", "d0gsaremybestfr13nds", "C@ts-and-Dogs-Living-together", ".Susa53", "d3ltagamm@",
            "BankLogin13", "BankLogin!3"};
        StringFormattingExamples.passwordCheck(passwords);*/

        String batchOfPasswords = "Dogcatchers; d0gsaremybestfr13nds, C@ts-and-Dogs-Living-together; .Susa53";

        String panagram1 = "The quick brown fox jumps over a lazy dog";
        System.out.println(reverseString(panagram1));
        String panagram2 = "Sphinx of black quartz, judge my vow";
        System.out.println(reverseString(panagram2));
        String panagram3 = "Pack my box with five dozen liquor jugs.";
        System.out.println(reverseString(panagram3));
    }

    private static String reverseString(String input) {
        char[] reversed = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            reversed[i] = input.charAt(input.length() -1 - i);
        }

        return Arrays.toString(reversed);
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

}
