import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IterratorWithSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(7);
        numbers.add(10);
        numbers.add(1);
        numbers.add(1);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 5) {
                it.remove();
            }
        }
        System.out.println("Original Array is: "+ numbers);
        //Sorting (not print yet)
        Collections.sort(numbers);
        System.out.println("Sorted Array is: "+numbers);


        //------------Iterating by passing lambda expression-----
        numbers.forEach(num -> System.out.println(num));


        // Reverse the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reverse Array is:"+numbers);



        /*NOTE: keep only numbers that divisible by 3
        then print the array in reverse order*/
        while (it.hasNext()) {
            int i = it.next(); //int hay Interger đều được
            if (i % 3 != 0) { // Remove numbers not divisible by 3
                it.remove();
            }
        }
        Collections.reverse(numbers);
        System.out.println(numbers);





    }
}
