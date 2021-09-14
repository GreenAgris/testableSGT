package calculator;

public class InitialCalculations {



    public static int ellipseArea(double a, double b) {
        return (int) Math.round(Math.PI * a * b);
    }


    public static int surfaceAreaCyl(double h, double r) {
        return (int) Math.round(2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2));
    }

    public static int cubeVolume (double a) {
        return (int) Math.round (Math.pow (a,3));
    }


    public static void main(String[] args) {
        int surface = surfaceAreaCyl(45, 4);
        System.out.println(surface);

        int area = ellipseArea(8, 15);
        System.out.println(area);

        int volume = cubeVolume(10);
        System.out.println (volume);
    }
    // ROUND them to int values
    // Group 1 -   Elipse area
    // Group 2 - cube volume
    // Group 3 -    sphere volume
    // Group 4 - surface area of cilynder


}
