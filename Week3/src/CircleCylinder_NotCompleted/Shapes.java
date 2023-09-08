/* This is the code for question 3.1 B*/
package CircleCylinder_NotCompleted;

import java.util.Scanner;
public class Shapes {
    public static void main(String args[]) {
        Circle[] shapes = new Circle[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Please enter 1 for circle \n 2 for cylinder");
            int shapeCode = in.nextInt();
            if (shapeCode == 1) {
                System.out.println("Please enter the Radius");
                double radius = in.nextDouble();
                shapes[i] = new Circle(radius);
            } else if (shapeCode == 2) {
                System.out.println("Please enter the Radius");
                double radius = in.nextDouble();
                System.out.println("Please enter the Height");
                double height = in.nextDouble();
                shapes[i] = new Cylinder(radius, height);
            } else {
                System.out.println("This is not accepted code \n Try again");
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println(i + "\t" + shapes[i] + "\t" + shapes[i].calcArea() + "\t" + shapes[i].calcCircumference());
            } else if (shapes[i] instanceof Cylinder) {
                Cylinder temp = (Cylinder) shapes[i];
                System.out.println(i + "\t" + shapes[i] + "\t" + shapes[i].calcArea() + "\t" + shapes[i].calcCircumference() + "\t" + temp.calcVolume());
            }
        }
    }
}

