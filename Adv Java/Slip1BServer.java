
import java.net.*;
import java.io.*;
class ChatServer
{
  public static void main(String arg[]) throws Exception
  {
    ServerSocket s=new ServerSocket(3333);
    Socket sk=s.accept();
    DataOutputStream dout=new DataOutputStream(sk.getOutputStream());
    DataInputStream din=new DataInputStream(sk.getInputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    while(true)
      {
           String msg=din.readUTF();
           System.out.println("Message recieved from Client-"+msg);
           System.out.println("Enter Message to send-");
           msg=br.readLine();
           dout.writeUTF(msg);
    }
 }
}
