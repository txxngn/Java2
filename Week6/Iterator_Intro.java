import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Intro {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList();
        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        Iterator<String> it = courses.iterator();  //data type must be same with the previous collection <String>
        while (it.hasNext()) {          //New way to loop!!
            System.out.println(it.next());
        }
        System.out.println("**************************");
        System.out.println(courses);
    }
}

