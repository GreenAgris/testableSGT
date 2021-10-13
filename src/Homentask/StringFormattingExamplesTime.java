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
    }
}