/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleCylender3;
import java.util.Scanner;

/**
 *
 * @author canad
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please eneter the Radius");
        double radius1=in.nextDouble();
        System.out.println("Please eneter the Height");
        
        double height1=in.nextDouble();
        
        Circle c1= new Circle();
        Cylinder cy1= new Cylinder();

        c1.setRadius(radius1);
        cy1.setRadius(radius1);
        cy1.setHeight(height1);
 
 
        System.out.println("The Radius is  "+c1.getRadius());
        System.out.println("The Height is  "+cy1.getHeight());


        System.out.println("The area of the circle is  "+c1.calcArea());
        System.out.println("The circumference  of the circle is  "+c1.calcCircumference());
        System.out.println("The area of the cylinder is  "+cy1.calcArea());
       
        System.out.println(c1+"   "+ cy1);  // For Question #3
        System.out.println("The volume of the cylinder is  "+cy1.calcVolume());
        //Question 5
        Circle c2= new Circle(10);
        Cylinder cy2= new Cylinder(20,30);
        System.out.println("The area of the circle#2  is  "+c2.calcArea());
        System.out.println("The circumference  of the circle#2 is  "+c2.calcCircumference());
        System.out.println("The area of the cylinder#2 is  "+cy2.calcArea());
        System.out.println("Circle#1 is equal to Circle#2 ?? "+c1.equals(c2));
        System.out.println("Cylinder#1 is equal to Cylinder#2 ?? "+cy1.equals(cy2));
        System.out.println();
        System.out.println();



        //Excercise 3.1 invoking the new method
        displayShapeInfo(c1);
        displayShapeInfo(cy1);
        
        
    }

    //Excercise 3.1 declaring the new method

    public static void displayShapeInfo(Circle c) {
        System.out.println(c);
        System.out.println("Area: " + c.calcArea());
        if (c instanceof Cylinder) {
            Cylinder temp = (Cylinder) c;
            System.out.println("Volume: " + temp.calcVolume());
        }
    }
    
}
