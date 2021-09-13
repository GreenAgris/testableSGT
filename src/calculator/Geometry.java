package calculator;

import static java.lang.Math.pow;

public class Geometry {

    //https://en.wikipedia.org/wiki/List_of_formulas_in_elementary_geometry
    public static double calculateCircleArea(double radius) { //A=\pi r^{2}
        return Math.PI * pow(radius, 2.0);
    }

}
