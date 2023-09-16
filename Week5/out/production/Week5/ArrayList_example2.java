import java.util.ArrayList;

public class ArrayList_example2 {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Cylinder cy1 = new Cylinder(10, 5);
        ArrayList<Circle> shapes = new ArrayList(5);//arrayList of Circles, capacity=5
        shapes.add(c);//0
        shapes.add(10, new Circle(5));                               //10 run time error, Exception

        System.out.println("shapes.size()="+shapes.size());
    }
}
