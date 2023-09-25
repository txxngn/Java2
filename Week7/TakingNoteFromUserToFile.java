package TuTest;

import java.util.*;
import java.io.*;
public class TakingNoteFromUserToFile {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        File myfile = new File ("notes.txt");
        boolean redFlag = true;
        PrintWriter pw = null;

        try{
            pw = new PrintWriter(myfile);
            while(redFlag){
                String lines = input.nextLine(); //take input from user
                pw.println(lines);              //input from user added to file
                if (lines == "")
                    redFlag = false;     //nếu false, cái while sẽ break vì vào loop để chạy thì while phải true
            }
        }catch(Exception e){
            System.out.println("Error");
        }finally{
            if (pw != null)
                pw.close();         //phải có cái này bắt buộc
        }



    }
}
