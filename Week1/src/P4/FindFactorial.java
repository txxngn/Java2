package P4;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial: "); //factorial là thừa số, thừa số của 3 là 1*2*3
        int x = input.nextInt();                                    //thừa số của 5 là 1*2*3*4*5
        int fact=1;
        for(int i=1;i<=x;i++){
            fact *= i;
        }
        System.out.println("The factorial of " + x + " is " + fact);
    }
}
