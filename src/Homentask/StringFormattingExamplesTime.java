package Homentask;

public class StringFormattingExamplesTime {

    // given hours and minutes in standard 24h values, return a formatted string that returns the same time in AM/PM format :
    //input 23, 43 -> 11:43 PM
    //input 2,20 ->   02:20 AM
    public static String americanStyleTimeString(int hour, int minute) {
        System.out.println("Given hours and minutes are: " + hour + ", "+ minute );
        String Time = "You entered incorrect numbers!!!";
        if (hour >= 0 && hour <= 9 && minute >= 0 && minute < 60  ) {
            Time = ( "0" + hour + ":" + minute + " AM" );
// SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        }

        return Time;
    }


    public static void main(String[] args) {
        System.out.println(americanStyleTimeString(99, 44));
        System.out.println(americanStyleTimeString(8, 44));
    }
}