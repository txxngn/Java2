package P3;
import java.lang.Math;

public class ConvertStringToOthers {
    public static void main (String [] arg){
            /*
    String s1 “12345”
    String s2 “1.34”
    num1 has the integer value of s1
    num2 has the double value from s2
    num3= num1(power of 2)+ num2

    Print
    num1=
    num2=
    num3=
     */
        String s1 = "12345";
        String s2 = "1.34";
        String s3 = s1 + s2;
        int num1 = Integer.parseInt(s1);
        double num2 = Double.parseDouble(s2);
        double num3 = Math.pow(num1,2) + num2;

        System.out.println("Num1 is " + num1);
        System.out.println("Num2 is " + num2);
        System.out.println("Num3 is " + num3);
        System.out.println(s3);







    }
}
