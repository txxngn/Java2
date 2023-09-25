package TuTest;
import java.util.*;
import java.io.*;

public class ReadTakingNoteFile {
    public static void main (String [] args){
        Scanner s = null;


        try{
            File myfile = new File("notes.txt");
            s = new Scanner (myfile);
            while (s.hasNext()){
                System.out.println(s.nextLine());
            }
        }catch (Exception e){
            System.out.println("error");
        }finally {
            if (s != null)
                s.close();
        }




    }
}
