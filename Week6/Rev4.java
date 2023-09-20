import java.util.ArrayList;
import java.util.Iterator;

public class Rev4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i <= 20; i = i + 2) {
            numbers.add(i);
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i % 5 == 0) {
                it.remove();
            }
        }
        // ---------------------------
        numbers.forEach(num->System.out.println(num+"******"));//to print the elements one by one.

        numbers.forEach(num->{System.out.println(num);});

        numbers.forEach(num->{System.out.println(num);      //để ý curly-bracket là in nhiều cái, ở trên k có
                                System.out.println("******");});
    }
}
