import java.util.LinkedList;

public class LinkedList_example4 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Circle c1 = new Circle(100);
        Cylinder cy1 = new Cylinder(100, 100);

        l.add(0, c1);
        l.add(1, cy1);
        l.add(new Circle(100));
        l.add(new Cylinder(100, 100));
        l.add(new Square(100));

        LinkedList ListOf100 = l;
        //*********************************
        LinkedList<Circle> l2 = new LinkedList();
        l2.add(0, c1);
        l2.add(1, cy1);
        l2.add(new Circle(100));
        l2.add(new Cylinder(100, 100));
        //l2.add(new Square(100)); //why this gives error?
        l2.addAll(ListOf100);
        for (int i = 0; i < l2.size(); i++) {
            System.out.println("l2[" + i + "] " + l2.get(i));
        }
    }
}
