import java.io.*;
public class TestWriter {
    public static void main (String [] args) {
        //code này tạo file test.txt ngay trong cùng folder với content là "Hello World"

        /*đầu tiên tạo printWriter ở ngoài, ban đầu tạo ở trong block try nhưng scope của pw chỉ ở trong try block
        *mà lý do dùng finally*/

        PrintWriter pw = null;
        try {
            File myFile = new File("test.txt");

            pw = new PrintWriter(myFile);
            pw.println("Hello World");
        }catch (Exception e) {
            System.out.println("Can't write file");
        }finally {
            if (pw != null)
                pw.close();
        }

        //Lý do có try/catch ở đây vì PrintWriter (thứ 2) là checked exception
    }

}
