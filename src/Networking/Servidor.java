
package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor extends Thread
{
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(8888);
        Socket s  = ss.accept();
        String strServer;
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String strClient = (String)dis.readUTF();
        while(!strClient.equals("stop")){

            
            System.out.println("Mensaje del cliente: " + strClient);
            
            System.out.print("Escribe un mensaje al cliente: ");
            strServer = br.readLine();
            dos.writeUTF(strServer);
            dos.flush();
            s  = ss.accept();
            strClient = (String)dis.readUTF();
        
        }
     
        s.close();
        ss.close();
        
    }
}
