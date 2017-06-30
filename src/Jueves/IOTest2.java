
package Jueves;

import java.io.FileOutputStream;


public class IOTest2 
{
    public static void main(String[] args) {
        try 
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia.txt");
            String s = "Magia";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
