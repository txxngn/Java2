package P9;

import java.util.*;
public class ExceptionError {
    public static void main (String [] args){
        try{
            Scanner input = new Scanner (System.in);
            System.out.println("Enter first num: ");
            int num1 = input.nextInt();
            System.out.println("Enter second num: ");
            int num2 = input.nextInt();
            int result = num1/num2;
            System.out.println(result);
        }
        //catch more than 1 error:
        catch(InputMismatchException Ie){                        //e ở đây là object
            System.out.println("Enter a numeric value " + Ie);    //k cần thêm e ở đây
        }
        catch (ArithmeticException Ae){
            System.out.println("Can't divide by 0");
        }
        catch(Exception e){                     //"EXCEPTION" phải để cuối cùng
            System.out.println("Error " + e);   //Exception nó bao tất cả các lỗi, nếu để đầu tiên nó sẽ
        }                                       //chạy luôn mà k chạy 2 lỗi cụ thể dưới

        /*nếu thêm object Ie/Ae/e thì output hiển thị thêm lỗi:
        "Enter a numeric value java.util.InputMismatchException"
         */

        /* vd Exception mà để catch đầu tiên, khi input = 0, nó k chạy lỗi ArithmeticException
        mà chạy Exception --> k đúng yêu cầu
         */




    }
}
