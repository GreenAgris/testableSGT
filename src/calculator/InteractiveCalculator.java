package calculator;

import java.util.Scanner;

public class InteractiveCalculator {

    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        welcome();
        //printOutMenu();
    }


    public static void printOutMenu() {
        System.out.println("1: calculate BirdCage");
        System.out.println("2: Show online Answer");
        System.out.println("3: Create online Question");
        System.out.println("4: calculate Formula");
        //System.out.println("5: calculate BirdCage");
    }

    public static void welcome() {
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome, " + name + "! What action do you want to do today?:");
        formulaCalculation(name);
    }

    public static void formulaCalculation(String name) {
        //https://www.pleacher.com/mp/mlessons/algebra/funform.html  -> 22nd formula will be used
        System.out.println(name + ", we can calculate a formula for horsepower today. ");

        System.out.print("Please input the rounds per second your engine is doing: ");
        double rpms = scanner.nextDouble();
        double horsepower = 15 - (Math.pow(rpms - 2000, 2.0) / 150000);
        System.out.println("By our calculations we estimate your car having " + horsepower + "  horespower!");

    }
}
