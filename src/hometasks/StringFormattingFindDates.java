package hometasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormattingFindDates {
    // "some text at 2021-10-25T23:49 will be sent for our people, " +
    //     "to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled.";
    // with the above input, print out in console following lines
    // 2021-10-25T23:49:12
    // 2021-10-31
    public static void findAndPrintDatesFromText(String input) {
        Pattern pat = Pattern.compile("([-:.]?[0-9]+(.[0-9]+)?){6,}");  // searching for numbers (incl."-"and":");
        // .(sign of any character-helps to ignore "T" before digits ; 6 - for min. 6 characters
        Matcher matcher = pat.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        findAndPrintDatesFromText("some text at 2021-10-25T23:49:12 will be sent for our people, to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled.");
    }
}

