import java.io.*;
public class TestDataStreams {
    public static void main (String [] args){
        try{
            DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.txt") );
            output.writeUTF("John Smith");
            output.writeInt(97);
            output.writeUTF("Frank Provenzano");
            output.writeInt(55);
            output.close();

            DataInputStream input = new DataInputStream(new FileInputStream("temp.txt"));
            System.out.println(input.readUTF()+ ": " + input.readInt());
            System.out.println(input.readUTF()+ ": " + input.readInt());
            input.close();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}
