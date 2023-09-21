import java.util.*;
import java.io.*;
public class TestRead {
    public static void main (String [] args){
        //read all line in a file
        Scanner scan = null;
        try{
            File file = new File ("test.txt");
            scan = new Scanner (file);
            while (scan.hasNext()){
                System.out.println(scan.nextLine()); //nếu đổi thành .next() thì nó print từng word
            }
        }catch (Exception e){
            System.out.println("Cant read file");
        }finally {
            if (scan != null)
                scan.close();
        }

    }
}
