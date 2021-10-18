package hometask;

public class ConverterDemo {
    public static void main(String[] args) {
        Converter converter1 = new Converter(1, 1, 1);
        converter1.printOutConvertCmToYards();
        converter1.printOutConvertCmToFeet();
        converter1.printOutConvertCmToInches();
        converter1.printOutConvertMetersToYards();
        converter1.printOutConvertMetersToFeet();
        converter1.printOutConvertMetersToInches();
        converter1.printOutConvertKilometerToMiles();
        System.out.println();

       Converter converter2 = new Converter(22, 86, 36);
        converter2.printOutConvertCmToYards();
        converter2.printOutConvertCmToFeet();
        converter2.printOutConvertCmToInches();
        converter2.printOutConvertCmToFeet();
        converter2.printOutConvertMetersToYards();
        converter2.printOutConvertMetersToFeet();
        converter2.printOutConvertMetersToInches();
        converter2.printOutConvertKilometerToMiles();
    }
}
