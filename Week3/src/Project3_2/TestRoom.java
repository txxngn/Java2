package Project3_2;

public class TestRoom {
    public static void main(String[] args) {
 
        Room r1 = new Room();
        r1.length=20;
        r1.width=30;
        
        Room r2=new Room();
        r2.length=20;
        r2.width=30;

        System.out.println("The Area of r1 is " + r1.getArea());
        System.out.println("The Area of r2 is " + r2.getArea());

        r1.getColor("white");
        r2.getColor("blue");


    }
}
