
package Networking;

import com.sun.xml.internal.messaging.saaj.util.CharReader;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;


public class Cliente extends Thread
{
    public static void main(String[] args) {
        try 
        {
            Socket a = new Socket("192.168.1.77", 6666);
            DataOutputStream dout = new DataOutputStream(a.getOutputStream());
            DataInputStream dis = new DataInputStream(a.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Escriba un mensaje: ");
            String strServidor = br.readLine();
            dout.writeUTF(strServidor);
            dout.flush();
            
            String strCliente = (String)dis.readUTF();
            
            while( !strCliente.equals("stop") ){
                
                System.out.println("Mensaje del servidor: " + strCliente);
                System.out.print("Escriba un mensaje al servidor: ");
                strServidor = br.readLine();
                dout.writeUTF(strServidor);
                dout.flush();
                a = new Socket("192.168.1.77", 6666);
                strCliente = (String)dis.readUTF();
            }
            
            
            dout.close();
            a.close();
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
