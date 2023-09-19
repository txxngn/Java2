import java.util.ArrayList;
public class ExcerciseToCompare {
    public static void main(String[] args) {
        /*Create an ArrayList to store numbers form 10 to 100 skip by 10, then
    print all the elements:
        Q1: On one line using forEach() method.
        Q2: On one line and separated by "," using for loop
        Q3: On one line and separated by "," using Lambda*/

        //Q1: forEach() method.
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            num.add(i);
        }
        num.forEach(System.out::println);


        //Q2: use methods of ArrayList
        for (int i = 0; i < num.size(); i++) {   //dùng for each bình thường print i cũng ra.
            System.out.print(num.get(i) + ", ");
        }
        System.out.println();


        // Q3: Lambda
        num.forEach(number -> System.out.print(number + ", "));
        System.out.println();






    }
}
