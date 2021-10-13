package Homentask;

public class StringFormattingExamplesTime {

    // given hours and minutes in standard 24h values, return a formatted string that returns the same time in AM/PM format :
    //input 23, 43 -> 11:43 PM
    //input 2,20 ->   02:20 AM
    public static String americanStyleTimeString(int hour, int minute) {
        System.out.println("Given hours and minutes are: " + hour + ", " + minute);
        String Time = "You entered incorrect numbers!!!";

        if (( ( hour >= 0 && hour <= 9 ) || ( hour == 24 ) ) && minute >= 0 && minute < 60) {
            if (hour == 0 || hour == 24) {
                Time = ( "Time in AM/PM format: " + ( 12 ) + ":" + minute + " AM" );
            } else {
                Time = ( "Time in AM/PM format: " + "0" + hour + ":" + minute + " AM" );
            }
        }
        if (hour >= 10 && hour < 12 && minute >= 0 && minute < 60) {
            Time = ( "Time in AM/PM format: " + hour + ":" + minute + " AM" );
        }
        if (hour >= 12 && hour < 24 && minute >= 0 && minute < 60) {
            if (hour == 12) {
                Time = ( "Time in AM/PM format: " + ( hour ) + ":" + minute + " PM" );
            } else {
                Time = ( "Time in AM/PM format: " + ( hour - 12 ) + ":" + minute + " PM" );
            }
        }
// SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return Time;
    }
    public static String format(int hour, int minutes){
        System.out.print(hour+ "," + minutes + " in AM/PM format: ");
        String pmOrAm = hour > 11 && hour < 24 ? "PM" : "AM";

        // trim "0-23 hour" to "0-11 hour", then replace "0" with "12"
        hour = (hour %= 12) == 0 ? 12 : hour; // hour is equal the reminder of hour divided to 12, if that is 0 - replace with 12

        // Apply desired format "HH:MM AM/PM"
        return String.format("%02d:%02d %s", hour, minutes, pmOrAm );} //%02d - format the integer with 2 digits, left padding it with zeroes

    public static void main(String[] args) {

        System.out.println(americanStyleTimeString(99, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(00, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(8, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(11, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(12, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(15, 44));
        System.out.println("");
        System.out.println(americanStyleTimeString(24, 44));
        System.out.println("");
        System.out.println(format(0,38));
        System.out.println("");
        System.out.println(format(9,38));
        System.out.println("");
        System.out.println(format(12,38));
        System.out.println("");
        System.out.println(format(24,38));
        System.out.println("");
        System.out.println( 24 %= 12);
    }
}