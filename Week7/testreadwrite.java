package TuTest;

import java.util.*;
import java.io.*;

public class testreadwrite {
    public static void main (String [] args){
        File myfile = new File("tutaofile.txt");
        PrintWriter pw = null;
        Scanner s = null;

        try{
            //write
            pw = new PrintWriter(myfile);
            pw.println("Abcdefgh");
            //read
            s = new Scanner(myfile);
            while (s.hasNext()){
                System.out.println(s.nextLine());
            }

        }catch (Exception e){
            System.out.println("file error");
        }finally{
            if (pw != null || s != null){
                pw.close();
                s.close();
            }
        }




    }
}
