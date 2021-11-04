package variablesTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import variables.StringFormattingExamples;

public class StringFormatExamplesUnitTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testHistogramFirstTest() {
        StringFormattingExamples.letterHist(
            "Some Nice confusing Text that can be an input, for creating a histogram, It even can ignore somē būgs!");
        assertEquals("[7, 2, 5, 0, 8, 2, 5, 2, 7, 0, 0, 0, 3, 10, 6, 1, 0, 4, 5, 8, 2, 1, 0, 1, 0, 0]", outputStreamCaptor.toString().trim()
        );
    }


    @Test
    public void testHistogramSecondTest() {
        StringFormattingExamples.letterHist(
            "After I already transferred simple text messages via light signals from a Raspberry Pi to an Arduino Uno "
                + "( Link: https://nerd-corner.com/sending-text-messages-with-visible-light-communication/ ),"
                + " I wanted to improve this system to be able to transfer any file formats in both directions. Since a Raspberry Pi uses Linux,"
                + "this system can be transferred to any Linux device for data transfer via VLC (visual light communication). ");
        assertEquals("[29, 7, 11, 10, 34, 9, 7, 8, 33, 0, 1, 14, 13, 26, 19, 7, 0, 27, 30, 31, 8, 7, 2, 4, 7, 0]",
            outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void testHistogramThirdTest() {
        StringFormattingExamples.letterHist("Siera kūka ar melleņu ievārījumu\n"
            + "Nepieciešams: Pamatnei:1½ glāzes brokastu (auzu) pārslu mušļa 2 ēdamk. sviesta 2 ēdamk. cukura\n"
            + "Virskārtai: 400 g jeb 2 iepakojumi krēmsiera 400 g jeb 1 iepakojums grieķu jogurta\n"
            + "1 glāze cukura 3 olas Melleņu ievārījumam:1 glāze melleņu ~1 glāze cukura\n"
            + "¼ glāze ūdens Pagatavošana Izkausē sviestu. Tam pievieno cukuru un brokastu pārslas jeb musli. Kārtīgi samaisa. Masu ieklāj cepšanas formā, kas izklāta ar cepampapīru. Cep cepeškrāsnī 200 grādos apmēram 5 minūtes. Atdzesē.\n"
            + "Krēmsieru samaisa ar grieķu jogurtu un cukuru. Lēnām pa vienai pievieno olas. Rūpīgi samaisa. Gatavo masu lej uz izceptās un atdzesētās pamatnes. Cepšanas formu no ārpuses aptin ar foliju, atstājot augšu atvērtu, un uz 40 minūtēm liek cepeškrāsnī apmēram 200 grādos. Cepeškrāsns apakšā novieto ūdens trauku.\n"
            + "Gatavo kūku nedaudz atdzesē un pārlej ar mazliet atdzesētu, svaigu melleņu ievārījumu, kas vārīts uz lēnas uguns, līdz ogas ir izšķīdušas un ievārījuma pilieni uz katliņa malām sākuši sarecēt.\n"
            + "Kūku atdzesē un liek ledusskapī sastingt vismaz uz 6 stundām, bet vēlams – uz 12 stundām.");
        assertEquals("[95, 6, 15, 18, 71, 3, 23, 0, 53, 16, 36, 34, 44, 34, 23, 30, 0, 48, 68, 42, 75, 19, 0, 0, 0, 25]",
            outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void printDatesFromTextTest() {
        StringFormattingExamples.findAndPrintDatesFromText(
            "some text at 2021-10-25T23:49 will be sent for our people, to remind that that next days meeting is moved to 10:30 and the planned party on 2021-10-31 is cancelled.");
        assertEquals(String.format("2021-10-25T23:49%n"
            + "2021-10-31"), outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void printDatesFromText2Test() {
        StringFormattingExamples.findAndPrintDatesFromText(
            "A single point in time can be represented by concatenating a complete date expression, the letter \"T\" as a delimiter, and a valid time expression. For example, \"2007-04-05T14:30\". In ISO 8601:2004 it was permitted to omit the \"T\" character by mutual agreement as in \"200704051430\",[33] but this provision was removed in ISO 8601-1:2019. Separating date and time parts with other characters such as space is not allowed in ISO 8601, but allowed in its profile RFC 3339.[34]\n"
                + "If a time zone designator is required, it follows the combined date and time. For example, \"2007-04-05T14:30Z\" or \"2007-04-05T12:30−02:00\".\n"
                + "Either basic or extended formats may be used, but both date and time must use the same format. The date expression may be calendar, week, or ordinal, and must use a complete representation. The time may be represented using a specified reduced precision format.");
        assertEquals(String.format("2007-04-05T14:30%n"
            + "2007-04-05T14:30%n"
            + "2007-04-05T12:30"), outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void printDatesFromText3Test() {
        StringFormattingExamples.findAndPrintDatesFromText(
            "Of these, the first three require two values separated by an interval designator which is usually a solidus (more commonly referred to as a forward slash \"/\"). Section 3.2.6 of ISO 8601-1:2019 notes that \"A solidus may be replaced by a double hyphen [\"--\"] by mutual agreement of the communicating partners.\" and previous versions used notations like \"2000--2002\".[39] Use of a double hyphen instead of a solidus allows inclusion in computer filenames;[40] in common operating systems, a solidus is a reserved character and is not allowed in a filename.\n"
                + "For <start>/<end> expressions, if any elements are missing from the end value, they are assumed to be the same as for the start value including the time zone. This feature of the standard allows for concise representations of time intervals. For example, the date of a two-hour meeting including the start and finish times could be simply shown as \"2007-12-14T13:30/15:30\", where \"/15:30\" implies \"/2007-12-14T15:30\" (the same date as the start), or the beginning and end dates of a monthly billing period as \"2008-02-15/03-14\", where \"/03-14\" implies \"/2008-03-14\" (the same year as the start).\n"
                + "If greater precision is desirable to represent the time interval, then more time elements can be added to the representation. An interval denoted \"2007-11-13/15\" can start at any time on 2007-11-13 and end at any time on 2007-11-15, whereas \"2007-11-13T09:00/15T17:00\" includes the start and end times. To explicitly include all of the start and end dates, the interval would be represented as \"2007-11-13T00:00/16T00:00\".");
        assertEquals(String.format("2007-12-14T13:30%n"
            + "2007-12-14T15:30%n"
            + "2008-02-15%n"
            + "2008-03-14%n"
            + "2007-11-13%n"
            + "2007-11-13%n"
            + "2007-11-15%n"
            + "2007-11-13T09:00%n"
            + "2007-11-13T00:00"), outputStreamCaptor.toString().trim()
        );
    }

    @Test
    public void americanStyleTimeStringTest() {
        assertEquals( "00:00 PM" ,  StringFormattingExamples.americanStyleTimeString(12,0));
        assertEquals( "02:20 AM" ,  StringFormattingExamples.americanStyleTimeString(2,20));
        assertEquals( "12:34 AM" ,  StringFormattingExamples.americanStyleTimeString(0,34));
        assertEquals( "05:17 PM" ,  StringFormattingExamples.americanStyleTimeString(17,17));
        assertEquals( "12:00 PM" ,  StringFormattingExamples.americanStyleTimeString(24,0));
        assertEquals( "11:17 PM" ,  StringFormattingExamples.americanStyleTimeString(23,17));
        assertEquals( "10:11 AM" ,  StringFormattingExamples.americanStyleTimeString(10,11));
        assertEquals( "10:11 PM" ,  StringFormattingExamples.americanStyleTimeString(22,11));
    }



    @Test
    public void passwordCheckTest() {
        StringFormattingExamples.passwordCheck(new String[]{"ala3"});
        assertEquals(String.format("Received input --> ala3%n"
            + "Length: 4 letters long, 1 digits, 0 non-alphabetic symbols given.%n"
            + "Analysis for password usage: NOT safe"), outputStreamCaptor.toString().trim()
        );
    }
    @Test
    public void passwordCheck2Test() {
        StringFormattingExamples.passwordCheck(new String[]{"ala23","dumble&^**234"});
        assertEquals(String.format("Received input --> ala23%n"
            + "Length: 5 letters long, 2 digits, 0 non-alphabetic symbols given.%n"
            + "Analysis for password usage: NOT safe%n"
            + "Received input --> dumble&^**234%n"
            + "Length: 13 letters long, 3 digits, 4 non-alphabetic symbols given.%n"
            + "Analysis for password usage: NOT safe"), outputStreamCaptor.toString().trim()
        );
    }
    @Test
    public void passwordCheck3Test() {
        StringFormattingExamples.passwordCheck(new String[]{"AllFailSpa£@£@1259", "queenOfQueen&33z(*"});
        assertEquals(String.format("Received input --> AllFailSpa£@£@1259%n"
            + "Length: 18 letters long, 4 digits, 4 non-alphabetic symbols given.%n"
            + "Analysis for password usage: IS safe%n"
            + "Received input --> queenOfQueen&33z(*%n"
            + "Length: 18 letters long, 2 digits, 3 non-alphabetic symbols given.%n"
            + "Analysis for password usage: IS safe"), outputStreamCaptor.toString().trim()
        );
    }


}
//    Received input --> <word> ;
// Length: 4 letters long, 0 digits, 0 non-alphabetic symbols given.
// Analysis for password usage: IS/NOT safe