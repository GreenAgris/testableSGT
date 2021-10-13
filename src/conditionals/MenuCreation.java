package conditionals;

import java.util.Scanner;

public class MenuCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! please enter the current week day for a good luck quote!");
        System.out.println(returnQuoteBasedOnDay(scanner.nextLine()));

        System.out.println("What is the current month?");
        System.out.println(returnInfoBasedOnMonth(scanner.nextLine()));

    }

    private static String returnInfoBasedOnMonth(String nextLine) {

    return "";
    }

    public static String returnQuoteBasedOnDay(String input) {
        String returnableString = "All that we are is the result of what we have though";

        switch (input) {
            case "Monday":
            case "monday":
            case "1":
                returnableString = "No one saves us but ourselves. No one can and no one may. We ourselves must walk the path.";
                break;
            case "Tuesday":
            case "tuesday":
            case "2":
                returnableString = "What you are is what you have been. What you’ll be is what you do now.";
                break;
            case "Wednesday":
            case "3":
            case "wednesday":
                returnableString = "There is nothing so disobedient as an undisciplined mind, and there is nothing so obedient as a disciplined mind.";
                break;
            case "Thursday":
            case "thursday":
            case "4":
                returnableString = "You, yourself, as much as anybody in the entire universe, deserve your love and affection.";
                break;
            case "Friday":
            case "friday":
            case "5":
                returnableString = "People with opinions just go around bothering each other.";
                break;
            case "Saturday":
            case "saturday":
            case "6":
                returnableString = "Endurance is one of the most difficult disciplines, but it is to the one who endures that the final victory comes.";
                break;
            case "Sunday":
            case "sunday":
            case "7":
                returnableString = "An idea that is developed and put into action is more important than an idea that exists only as an idea.";
                break;
            default:
                System.out.println("We did not understand the input, so here is some random quote: ");

        }

        return returnableString;
    }
}
