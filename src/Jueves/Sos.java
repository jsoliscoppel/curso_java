
package Jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Sos 
{
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while((i=bis.read()) != -1){
                System.out.print((char)i);
            }
            bis.close();
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
