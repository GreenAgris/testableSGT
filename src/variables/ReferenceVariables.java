package variables;




    public class ReferenceVariables {

        public static void main(String[] args) {

            int cm = 1;
            double inch = cm / 2.54;

            System.out.println (cm + "cm =");
            System.out.println(inch + "inch");

            double ft = cm / 30.48;
            System.out.println(cm + " cm = ");
            System.out.println(ft + " ft");

            double m = cm * 100;

            double yards = 0.9144 * m;

            System.out.println(" meter = ");
            System.out.println(yards + " yards");

        }
    }







