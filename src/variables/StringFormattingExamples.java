package variables;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormattingExamples {

    static String englishAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // given hours and minutes in standard 24h values, return a formatted string that returns the same time in AM/PM format :
    //input 23, 43 -> 11:43 PM
    //input 2,20 ->   02:20 AM
    public static String americanStyleTimeString(int hour, int minute) {
       return "";
    }

    // "some text at 2021-10-25T23:49 will be sent for our people, to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled."
    // with the above input, print out in console following lines
    // 2021-10-25T23:49:12
    // 2021-10-31
    public static void findAndPrintDatesFromText(String input) {

    }

    //take an array of Strings and create an passwordCheck function, that for each String (in example read as <word> )
    // prints out the following with correctly calculated numerical values:
    // Received input --> <word> ;
    // Length: 4 letters long, 0 digits, 0 non-alphabetic symbols given.
    // Analysis for password usage: IS/NOT safe

    // for a word to be considered safe for password usage, following conditions needs to be met:
    // * needs to be at least 8 symbols long
    // * needs at least one uppercase and one lowercase letter
    // * needs at least one digit/number
    // * needs at least on non-alphabetic symbol to be used

    public static void passwordCheck(String[] input) {

    }

    // takes an English string as a parameter and returns a histogram  array of the letters in the string.
    // The zeroth element of the histogram should contain the number of a’s in the string (upper- and lowercase);
    // the 25th element should contain the number of z’s.
    // solution should only traverse the string once.
    public static int[] letterHist(String input) {
        return new int[26];
    }

}
