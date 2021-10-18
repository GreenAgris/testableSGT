package hometask;

public class Palindrome {
    /*A word is a palindrome if it can be read the same both forward and backward.
     Create a function in class "LoopsSecondExamples" named isStringPalindrome(String input) that can
     determine if a String is a palindrome. (Test values like "otto" and "palindromeemordnilap")
     */

    public static boolean isStringPalindrome(String input) {
        input = input.toLowerCase().replaceAll(" ", ""); //no difference: upper or lower case, with spaces or without
        char[] arr = input.toCharArray(); // converting our text from string to array of chars
        for ( int i = 0; i < arr.length / 2; i++ )
            if (arr[i] != arr[arr.length - i - 1]) { // compering first half with second in opposite direction
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("Abba"));
        System.out.println(isStringPalindrome("ABB A"));
        System.out.println(isStringPalindrome("А роза упала на лапу Азора"));
    }
}
