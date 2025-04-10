import java.net.*;
import java.util.*;
import java.io.*;
public class Slip14BServer {
    public static void main(String[] args) throws Exception{
        ServerSocket sc = new ServerSocket(3333);
        Socket s = sc.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        String datafromClient = din.readUTF();
        File f = new File(".\\src");
        String arr[] = f.list();
        for(int i=0;i<arr.length;i++){
            if(arr[i].endsWith(datafromClient)){
                System.out.println(""+arr[i]);
            }
        }
    }
}