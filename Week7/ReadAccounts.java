package ReadManyObjects;

import java.io.*;
import java.util.*;
public class ReadAccounts {
    public static void main(String[] args){
        ObjectInputStream input = null;
        try{
            input = new ObjectInputStream(new FileInputStream("accounts.dat"));
            while(true){
                Account acc = (Account) input.readObject();
                System.out.println(acc);
            }
        }catch(EOFException eof){
        }catch(Exception e){
            System.out.println("Error reading objects"+e);
        }finally{
            try{
                input.close();
            }catch(Exception e){
                System.out.println("Error closing");
            }
        }
    }
}

