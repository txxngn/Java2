package P9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyClass {
    public static void main (String [] args){
        //finally will always run


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first num: ");
            int num1 = input.nextInt();
            System.out.println("Enter second num: ");
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        }catch(InputMismatchException Ie){
            System.out.println("Enter a numeric value " + Ie);
        }catch (ArithmeticException Ae){
            System.out.println("Can't divide by 0");
        }catch(Exception e){
            System.out.println("Error " + e);
        }
        finally {
            System.out.println("Program complete.");
        }

        System.out.println("More code after the try/catch");
        //finally will always run but some "after try/catch code statement" will NOT run bc of the catch, that's why use finally here
        //if catch have "return" or "throw"
    }
}
