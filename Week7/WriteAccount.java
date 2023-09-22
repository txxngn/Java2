package ObjectBinaryIO;

import ObjectBinaryIO.Account;

import java.io.*;
public class WriteAccount {
    public static void main (String [ ]args){
        try{
            Account acc1 = new Account("John Smith","111", 100);
            Account acc2 = new Account ("Jane Doe", "222", 200);

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("account.dat"));
            output.writeObject(acc1);
            output.writeObject(acc2);
            output.close();
        }catch (Exception e ){
            System.out.println("Error: " + e);
        }
    }
}
