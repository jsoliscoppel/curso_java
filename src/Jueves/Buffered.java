
package Jueves;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Buffered 
{
    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia1.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String s = "Hola \n a todos";
            byte[] b = s.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
