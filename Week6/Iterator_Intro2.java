import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Intro2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();//new ArrayList<Integer>() or new ArrayList() đều được
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1);
        numbers.add(1);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            int i = it.next();//Integer //quan trọng chỗ này khác với string
            if(i < 5) {
                it.remove();
            }
        }
        System.out.println(numbers);//prints a string representation of the array list.
    }
}

