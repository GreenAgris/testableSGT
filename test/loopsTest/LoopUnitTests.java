package loopsTest;


import static loops.LoopsExamples.findFirstPrimeNumber;
import static loops.LoopsExamples.findLargest;
import static loops.LoopsExamples.findSomethingInText;
import static loops.LoopsExamples.multiplyOnlyEvenNumbers;
import static loops.LoopsExamples.printOutCalculationTable;
import static loops.LoopsExamples.sumInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import loops.LoopsExamples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopUnitTests {
    //public class LoopUnitTests {

        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        @BeforeEach
        public void setUp() {
            System.setOut(new PrintStream(outputStreamCaptor));
        }

        @Test
        public void unitLoopSumTest() {
            int check = sumInt(new int[]{16, 20, 21, 23});
            assertEquals(80, check, "Sum did not work");
            check = sumInt(new int[]{16, 20, 21, 253, 567, 323, 7809});
            assertEquals(9009, check, "Sum did not work");
        }

        @Test
        public void unitLoopSumNegitveNumbersTest() {
            int check = sumInt(new int[]{16, -20, 21, 23});
            assertEquals(40, check, "If passed a negative number sum did not work");

            check = sumInt(new int[]{-16, -20, -21, 23});
            assertEquals(-34, check, "If passed a negative number sum did not work");
        }

        @Test
        public void unitLoopMaxTest() {
            int check = findLargest(new int[]{16, 20, 21, 23});
            assertEquals(23, check, "Find largest did not work");
            check = findLargest(new int[]{1677, 2000, 2441, 2389});
            assertEquals(2441, check, "Find largest did not work");
        }

        @Test
        public void evenNumberMultiplyUnitTest() {
            assertEquals(240, multiplyOnlyEvenNumbers(new int[]{11, 12, 10, 13, 15, 17, 19, 2}),
                    "If passed a negative number sum did not work");
            assertEquals(640, LoopsExamples.multiplyOnlyEvenNumbers(new int[]{11, 1, 2, 10, 13, 8, 17, 19, 4}),
                    "If passed a negative number sum did not work");
        }

        @Test
        public void findPrimeNumbersNoneUnitTest() {
            assertEquals(-1, findFirstPrimeNumber(new int[]{12, 14, 18, 22, 28}),
                    "Prime finding returned incorrect value when no prime number should be found");
            assertEquals(-1, findFirstPrimeNumber(new int[]{4}), "Prime finding returned incorrect value when no prime number should be found");
        }

        @Test
        public void findPrimeNumbersUnitTest() {
            assertEquals(11, findFirstPrimeNumber(new int[]{12, 14, 18, 22, 11}), "Prime finding returned incorrect value");
            assertEquals(23, findFirstPrimeNumber(new int[]{4, 56, 23, 89, 11}), "Prime finding returned incorrect value");
        }

        @Test
        public void testMultiplicationTables() {
            printOutCalculationTable(6);
            assertEquals(String.format("1   2   3   4   5   6%n"
                    + "   2   4   6   8  10  12%n"
                    + "   3   6   9  12  15  18%n"
                    + "   4   8  12  16  20  24%n"
                    + "   5  10  15  20  25  30%n"
                    + "   6  12  18  24  30  36"), outputStreamCaptor.toString().trim()
            );
        }

        @Test
        public void testSmallMultiplicationTables() {
            printOutCalculationTable(3);
            assertEquals(String.format("1   2   3%n"
                    + "   2   4   6%n"
                    + "   3   6   9"), outputStreamCaptor.toString().trim()
            );
        }


        @Test
        public void testSmallMultiplicationAdvancedTables() {

            printOutCalculationTable(6, 9);
            assertEquals(String.format("36  42  48  54%n"
                    + "  42  49  56  63%n"
                    + "  48  56  64  72%n"
                    + "  54  63  72  81"), outputStreamCaptor.toString().trim()
            );

        }

        @Test
        public void testMultiplicationAdvancedTables() {

            printOutCalculationTable(9, 13);
            assertEquals(String.format("81  90  99 108 117%n"
                    + "  90 100 110 120 130%n"
                    + "  99 110 121 132 143%n"
                    + " 108 120 132 144 156%n"
                    + " 117 130 143 156 169"), outputStreamCaptor.toString().trim()
            );

        }

        @Test
        public void testStringSearchArray() {
            var found = findSomethingInText("star", new String[]{"seastar", "Patrick", "Patrick seastar",
                    "Omnibus", "Stellaris", "Observable universe is full of things.", "We can see only part of it due to limitations of our eyes ",
                    "so we use instruments to expand our \"eyesight\" ",
                    "and with that we can see more than just the bright stars on the night sky."});
            var expectedArray = new String[]{"seastar", "Patrick seastar",
                    "and with that we can see more than just the bright stars on the night sky."};
            assertTrue(Arrays.deepEquals(expectedArray, found), "String search did not find text as expected");
        }
    }

