package Cirle_Cylinder2;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Radius");
        double radius1=in.nextDouble();
        System.out.println("Please enter the Height");
        double height1=in.nextDouble();

        Circle2 c1= new Circle2();
        Cylinder2 cy1= new Cylinder2();
        c1.setRadius(radius1);
        cy1.setHeight(height1);


        System.out.println(cy1);

        Circle2 c2 = new Circle2(10);
        Cylinder2 cy2 = new Cylinder2(20, 30);

        System.out.println("Compare 2 Circles: " + c1.equals(c2));
        System.out.println("Compare 2 Cylinders: " + cy1.equals(cy2));


    }
}
