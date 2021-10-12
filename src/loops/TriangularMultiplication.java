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
        for ( int i = minNumber; i <= maxNumber; i++ ) { //for all numbers in range
            for ( int j = minNumber; j <= i; j++ ) { //only till as many times as large taken number is
                System.out.format("%4d", i * j); // multiplication in table format
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printOutTriangleCalculationTable(1, 6);
    }


}
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//    float a[n], s = 0;
//    int i = 0;
//
//    printf("vvedite elementi massiva\n");
//
//    for (i=0;i<n;i++)
//        scanf("%f", &a[i]);
//
//    for(i = 0; i < n; ++i)
//        printf("%f ", a[i]);
//    printf("\n");
//
//    for(i = 0; i < n; ++i)
//        s+= a[i];
//    printf("summa: %f\n", s);
//
//    for(i = 0; i < n; ++i)
//        a[i] /= s;
//
//    for(i = 0; i < n; ++i)
//        printf("%f ", a[i]);