package variables;

public class BasicVariables {


    public static void main(String[] args) {
        int wholeNumber = 123;
        int otherNumber = 13;

        int wholeNumber = 123;
        int otherNumber = 13;
        short shortNumber = 123;

        float complexNumber = 56.7f;
        char namedChar = '%';
        double complexDoubleNumber = 56.7d;
        boolean truthOrFalsehood; // what is the value?
        boolean isShortEqualToInt = wholeNumber == shortNumber; // == means is it equal, used only for primitive variables

        truthOrFalsehood = wholeNumber > otherNumber; // true
        var test234Name = shortNumber + wholeNumber;
        System.out.println(namedChar + test234Name); // %246
        System.out.println("" + namedChar + test234Name);

        System.out.println(1 + 2 + "Hello"); // the output is 3Hello
        System.out.println("Hello" + 1 + 2); // the output is Hello12
        System.out.println(namedChar + (complexNumber + complexDoubleNumber));
        //    System.out.println( truthOrFalsehood + isShortEqualToInt); // this makes no sense, don't do that :)
        System.out.println(" whole number result : " + wholeNumber);
        System.out.println(" boolean result : " + isShortEqualToInt);
        System.out.println("Difference: ");
        System.out.println(otherNumber - wholeNumber);

        System.out.println(truthOrFalsehood);
        truthOrFalsehood = wholeNumber < otherNumber;
        System.out.println(truthOrFalsehood);


        System.out.println(isShortEqualToInt);
        System.out.println(" Some interesting things that we can try? : " + (wholeNumber + otherNumber) );
    }


}
