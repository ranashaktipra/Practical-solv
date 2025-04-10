import java.io.*;
import java.net.*;
import java.util.*;

class Slip18BServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(10001);
        System.out.println("I am Server");
        Socket s = ss.accept();
        Scanner sc = new Scanner(System.in);
               DataOutputStream dout = new DataOutputStream(s.getOutputStream());

              DataInputStream dis = new DataInputStream(s.getInputStream());

        while(true){
            System.out.print("Server : ");
            String server_input = sc.nextLine();
                // 1st
                dout.writeUTF(server_input);
                // 4th
                String str = dis.readUTF();
                    System.out.println("Client : "+str);

            }
        }
}
