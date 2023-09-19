import java.util.ArrayList;
import java.util.Iterator;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1);
        numbers.add(1);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 5) {
                it.remove();
            }
        }
        //------------Iterating by passing lambda expression-----
        numbers.forEach(num -> System.out.println(num)); //num is represented object in array numbers
                                                    //can be any type
    }
}
