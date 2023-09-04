package P3;
import java.util.Scanner;

public class TestSquare {
    /**
     *This code explain something something
     * @param arg
     */
    public static void main (String [] arg){
        /*
         A class called "Square" which has the following:
            Side: double (private)
            calcArea():double
            calcPer(): double
            toString(): String
            getSide()
            SetSide()

            Main class called "TestSquare" to:
            • Accept the side’s value from the user (Using Scanner)
            • Create 2 new square objects:
            S1 has side=entered value
            S2 has side= entered value*2

            • Print the necessary results.
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the side value: ");
        double side = input.nextDouble();


        Square S1 = new Square();
        S1.setSide(side);
        System.out.println("Side is " + S1.getSide());
        System.out.println("Area is " + S1.calcArea());
        System.out.println("Per is " + S1.calcPer());
        System.out.println(S1);

        Square S2 = new Square();
        S2.setSide(side*2);
        System.out.println("Side 2 is " + S2.getSide());
        System.out.println("Area 2 is " + S2.calcArea());
        System.out.println("Per 2 is " + S2.calcPer());
        System.out.println(S2);

    }
}

