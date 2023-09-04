package P2;
import P1.Room;

public class test {
    public test() {
    }

    public static void main(String[] args) {
        Room r4 = new Room();
        r4.length=10;
        r4.width=30;

        System.out.println("First small room: "+r4.getDimensions());
        System.out.println("First small room: "+r4.getArea());

        student s1= new student("Alex",20);
        System.out.println("s1 name"+s1.getName());
        System.out.println("s1 age"+s1.getAge());

    }

}
