package ReadManyObjects;

import java.io.Serializable;

public class Account implements Serializable {
    String name;
    String id;
    double balance;
    public Account(String name, String id, double balance){
        this.name=name;
        this.id = id;
        this.balance = balance;
    }

    public String toString(){
        return "ObjectBinaryIO.Account [Name: " +name + ", ID" + id + ", Balance: " + balance;
    }
}
