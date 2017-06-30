
package Jueves;

import java.io.FileOutputStream;
import java.io.IOException;


public class IOTest 
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\hola.txt");
            fos.write(65);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
