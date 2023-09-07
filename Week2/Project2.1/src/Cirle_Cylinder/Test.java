package Cirle_Cylinder;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please eneter the Radius");
        double radius1=in.nextDouble();
        System.out.println("Please eneter the Height");
        
        double height1=in.nextDouble();
        
        Circle c1= new Circle();
        Cylinder cy1= new Cylinder();

        c1.setRadius(radius1);
        cy1.setHeight(height1);
 
        System.out.println("The Radius is  "+c1.getRadius());
        System.out.println("The Height is  "+cy1.getHeight());


        System.out.println("The area of the circle is  "+c1.calcArea());
        System.out.println("The circumference  of the circle is  "+c1.calcCircumference());
        System.out.println("The area of the cylinder is  "+cy1.calcArea());

        
    }
    
}
