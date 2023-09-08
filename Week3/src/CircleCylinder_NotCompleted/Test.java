package CircleCylinder_NotCompleted;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please eneter the Radius");
        double radius1 = in.nextDouble();
        System.out.println("Please eneter the Height");

        double height1 = in.nextDouble();

        Circle c1 = new Circle();
        Cylinder cy1 = new Cylinder();

        c1.setRadius(radius1);
        cy1.setRadius(radius1);
        cy1.setHeight(height1);

        System.out.println("The Radius is  " + c1.getRadius());
        System.out.println("The Height is  " + cy1.getHeight());

        System.out.println("The area of the circle is  " + c1.calcArea());
        System.out.println("The circumference  of the circle is  " + c1.calcCircumference());
        System.out.println("The area of the cylinder is  " + cy1.calcArea());

        System.out.println(c1 + "   " + cy1);  // For Question #3
        System.out.println("The volume of the cylinder is  " + cy1.calcVolume());
        
        Circle c2 = new Circle(10);
        Cylinder cy2 = new Cylinder(20, 30);
        System.out.println("The area of the circle#2  is  " + c2.calcArea());
        System.out.println("The circumference  of the circle#2 is  " + c2.calcCircumference());
        System.out.println("The area of the cylinder#2 is  " + cy2.calcArea());
        


        
        Circle roundShape = new Cylinder(1, 2);
        System.out.println(roundShape);
        Cylinder can = (Cylinder) roundShape;
        System.out.println(can);
        System.out.println("\n");
//##############################################


        displayShapeInfo(c1);
        displayShapeInfo(cy1);

        // using Object class example
        Object shape1 = new Circle(2);
        Object shape2 = new Cylinder(3, 1);
        System.out.println(shape1);
        System.out.println(shape2);

        // Abstract
        System.out.println("\n************   Abstract ************\n");
        Circle2 cc = new Circle2(50);
        System.out.println(cc.getArea());

        //Compare
        System.out.println("c1.equals(c2) is "+c1.equals(c2));
        System.out.println("cy1.equals(cy2) is "+cy1.equals(cy2));

        // Exercise for session 3.2: Using compareTo
        System.out.println("c1.area= "+ c1.calcArea() +" c2.area= "+ c2.calcArea() );
        System.out.println("c1.compareTo(c2)= "+c1.compareTo(c2));
        System.out.println("cy1.Volume= "+ cy1.calcVolume() +" cy2.Volume= "+ cy2.calcVolume());
        System.out.println("cy1.compareTo(cy2)= "+cy1.compareTo(cy2));

    }
    
    public  static void displayShapeInfo(Circle c) {
        System.out.println(c);
        System.out.println("Area: " + c.calcArea());
        if (c instanceof Cylinder) {
            Cylinder temp = (Cylinder) c;
            System.out.println("Volume: " + temp.calcVolume());
        }

    }

}
