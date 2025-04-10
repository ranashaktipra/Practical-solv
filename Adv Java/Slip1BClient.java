import java.net.*;
import java.io.*;
class ChatClient
{
  public static void main(String arg[]) throws Exception
  {
       String msg;
       Socket s=new Socket("localhost",3333);
           DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din=new DataInputStream(s.getInputStream());
         while(true)
          {
            System.out.println("Enter Message to send-");
              msg=br.readLine();
              dout.writeUTF(msg);
              msg=din.readUTF();
           System.out.println("Message recieved from Server-"+msg);
         }
    }
}
