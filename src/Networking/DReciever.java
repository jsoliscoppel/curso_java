
package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class DReciever 
{
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] b = new byte[1024];
        DatagramPacket dp = new DatagramPacket(b, 1024);
        
        ds.receive(dp);
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);
        
        ds.close();
    }
}
