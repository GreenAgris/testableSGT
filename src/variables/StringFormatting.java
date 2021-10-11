package variables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Example class for different string handling usages and additional materials from the presentation.
 */
public class StringFormatting {

    public static final char piChar = '\u03C0';


    public static void main(String[] args) {
        romanAlphabetPrint();
        asciiPrint();
        printPiDifferentPrecisions();

        String bigTestable = "AbC";
        //technically speaking char array is a string - Just the String class has more added functions and features.
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);

        String testable = "abc";

        System.out.println(str);
        // some String definitions to be used later in code.
        String shortText = "a and Z";
        String definition = "A pangram or holoalphabetic sentence is a sentence using every letter of a given alphabet at least once.";
        String panagram1 = "The quick brown fox jumps over a lazy dog";
        String panagram2 = "Sphinx of black quartz, judge my vow";
        String panagram3 = "Pack my box with five dozen liquor jugs.";
        String ultimatePanagram = "The beige hue on the waters of the loch impressed all, including the French queen, before she heard that symphony again, just as young Arthur wanted.";


        System.out.println(shortText.length());//prints out the number of characters in the given string (spaces are characters)
        System.out.println(shortText.charAt(1)); // just as in any array - programmers start counting from 0, so here we print out " "

        System.out.println(testable == str);
        System.out.println(testable.equals(str));
        System.out.println(testable.equalsIgnoreCase(bigTestable));
        double testDouble = 123456789.123456789;
        System.out.println(String.format("Be careful with large decimal numbers,"
                + " since the precision is still limited : %f , %.2f, %.16f", testDouble, testDouble, testDouble));

        String[] names = {"Jānis", "Otto", "Kaspars", "Ieva", "Laima", "Anna"};

        for ( String test : names ) {
            System.out.println("Is " + test + " male name: " + isLatvianMaleName(test));

            System.out.println(String.format("Is %s female name: %b", test, isLatvianFemaleName(test)));
        }

        String testText =
                "Regular expressions originated in 1951, when mathematician Stephen Cole Kleene described regular"
                        + " languages using his mathematical notation called regular events. These arose in theoretical "
                        + "computer science, in the subfields of automata theory (models of computation) and the description "
                        + "and classification of "
                        + "formal languages. Other early implementations of pattern matching include the SNOBOL language,"
                        + " which did not use regular expressions, but instead its own pattern matching constructs."
                        + "Regular expressions entered popular use from 1968 in two uses: pattern matching in a text editor[6]"
                        + " and lexical analysis in a compiler.[7] Among the first appearances of regular expressions in program "
                        + "form was when Ken Thompson built Kleene's notation into the editor QED as a means"
                        + " to match patterns in text files.";

        System.out.println("Test text has words: " + howManyWordsAreGiven(testText));
        System.out.println("2Test text has words: " + howManyWordsAreGiven2(testText));
        System.out.println("Test text has words: " + howManyWordsAreGiven(" tes test test123"));
        System.out.println("Test text has 'the' words: " + howManySpecificWordsAreGiven(testText, "the"));
        System.out.println("2Test text has 'the' words: " + howManySpecificWordsAreGiven2(testText, "the"));
    }


    public static void romanAlphabetPrint() {
        System.out.print("Roman alphabet: ");
        for ( char c = 'A'; c <= 'Z'; c++ ) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void asciiPrint() {
        for ( char c = 'A'; c <= 'z'; c++ ) {
            System.out.print(c);
        }
        System.out.println();
    }

    //place for live examples
    public static boolean isLatvianMaleName(String input) {
        // [a-zA-Z0-9_āī]+s$
        //   Pattern pattern = Pattern.compile("[a-zA-Z0-9_āī]+s$");
        // input.contains(pattern); // this will not work, since we are using a description not exact values for what we are searching for

        // form presentation    if(bankIBAN.matches(regexPattern))
        return input.matches("[a-zA-Z0-9_āī]+s$");
    }

    public static boolean isLatvianFemaleName(String input) {
        return input.matches("[a-zA-Z0-9_āī]+[ae]$");
    }

    public static int howManyWordsAreGiven(String input) {
        int count = 0;
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int howManyWordsAreGiven2(String input) {
        String[] arrayOfStrings = input.split(" ");
        return arrayOfStrings.length - 1;
    }

    int howManySpecificWordsAreGiven(String input) {

        int counter = 0;

        Pattern pattern = Pattern.compile("the");
        Matcher match = pattern.matcher(input);

        while (match.find()) {
            counter++;
        }

        return counter;

    }

    int howManySpecificWordsAre(String input, String searchable) {

        int counter = 0;

        Pattern pattern = Pattern.compile(searchable);
        Matcher match = pattern.matcher(input);

        while (match.find()) {
            counter++;
        }

        return counter;

    }


    public static int howManySpecificWordsAreGiven2(String input, String searchable) {
        String[] arrayOfStrings = input.split(searchable);
        return arrayOfStrings.length - 1;
    }

    public static void printPiDifferentPrecisions() {

        System.out.println(String.format("Most know %c as %.3f", piChar, Math.PI));
        System.out.println(String.format(
                "But since %c is a mathematical constant that is actually not a whole number, it has unending digits after the decimal point,since it is not practical to use an unending number, the calculations usually use the value as %f .",
                piChar, Math.PI));
    }


}
