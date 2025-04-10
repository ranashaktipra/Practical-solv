import java.net.*;
import java.io.*;
import java.util.*;

public class Slip22AServer {

    public static void main(String[] args) throws Exception {
        // Create server socket
        ServerSocket serverSocket = new ServerSocket(4444);

        Socket clientSocket = serverSocket.accept();

      
        Date date = new Date();
        String dateTime = date.toString();

        // Send date and time to client
        DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());
        dout.writeUTF(dateTime);

        // Close socket
        clientSocket.close();
        serverSocket.close();
    }
}