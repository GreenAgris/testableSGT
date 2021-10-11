package loops;

public class TriangularMultiplication {

    //Advanced exercises
    //printOutCalculationTable(4)should create output on screen like:
    //1
    //2  4
    //3  6  9
    //4  8  12  16
    //5  10 15  20  25
    //6  12 18  24  30  36
    //System.out.printf("%4d",number); will come in handy here - it formats more neatly and does not insert a new line

    public static void printOutTriangleCalculationTable(int minNumber, int maxNumber) {
        for ( int i = minNumber; i <= maxNumber; i++ ) {
            for ( int j = minNumber; j <= i; j++ ) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printOutTriangleCalculationTable(1, 6);
    }


}
