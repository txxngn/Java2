import java.util.ArrayList;
import java.util.Iterator;

public class Rev3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 2; i <= 20; i = i + 2) {
            numbers.add(i);

        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if ((i % 5 == 0) && (i%10==0)) {
                it.remove();
            }
        }
        // ------------Iterating by passing method reference---------------
        numbers.forEach(System.out::println);//to print the elements one by one.
    }
}
