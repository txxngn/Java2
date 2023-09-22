package ObjectBinaryIO;

import ObjectBinaryIO.Account;

import java.io.*;

public class ReadTwoAccounts{
    public static void main (String [] args){
        ObjectInputStream input = null;
        try{
            input = new ObjectInputStream(new FileInputStream("account.dat"));
            Account acc1 = (Account) input.readObject();
            Account acc2 = (Account) input.readObject();
            System.out.println(acc1);
            System.out.println(acc2);
            input.close();
        }catch(Exception e){
            System.out.println("Error reading objects " +e);
        }


    }
}
