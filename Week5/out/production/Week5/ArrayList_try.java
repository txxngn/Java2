import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_try {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Cylinder cy1 = new Cylinder(10, 5);
        LinkedList<Circle> roundOnes = new LinkedList();

        for (int i = 1; i <= 5; i++) {
            roundOnes.add(new Circle(i));
            roundOnes.add(new Cylinder(i, i + 5));  //add 5 circle and 5 cylinder into roundOnes
        }
        System.out.println("roundOnes size= " + roundOnes.size()); //-> size = 10
        //************************************************************************
        ArrayList shapes2 = new ArrayList(5);// array list of different  objects
        ArrayList<Circle> shapes = new ArrayList(5);//arrayList of Circles
        System.out.println(shapes.size());
        shapes.add(c);
        System.out.println(shapes.size());
        shapes.add(1, c);//
        System.out.println(shapes.size());
        shapes.add(1, new Circle(5));
        System.out.println(shapes.size());
        shapes.addAll(roundOnes);
        System.out.println(shapes.size());
        shapes.addAll(1, roundOnes);
        System.out.println(shapes.size());
        //*********************** done part 1********************************




        //shapes.addAll(100,roundOnes);//java.lang.IndexOutOfBoundsException: Index: 100, Size: 27
        Circle oldShape = shapes.set(4, new Circle(100));
        System.out.println(oldShape);
        Circle c2 = shapes.get(0);
        System.out.println("First object is  " + c2);

        Circle removedElement = shapes.remove(0);
        System.out.println("The Removed element is  " + removedElement);
        System.out.println("Now First object is " + shapes.get(0));
        boolean isGone = shapes.remove(removedElement);
        System.out.println(isGone);
        //****************************

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("shapes[" + i + "] " + shapes.get(i));
        }
        System.out.println("c is " + c);
        if (shapes.contains(c)) {
            System.out.println("Yes there is a Circle");
        } else {
            System.out.println("There is no " + c);
        }
        if (shapes.contains(new Circle(5))) {
            System.out.println("Yes there is a Circle with radius 5");
        }

    }

}
