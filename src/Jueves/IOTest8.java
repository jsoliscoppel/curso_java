
package Jueves;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class IOTest8 {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia1.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia2.txt");
            
            int i;
            while((i=sis.read()) != -1){
                System.out.print((char)i);
                fos.write(i);
            }
            fis.close();
            fis2.close();
            sis.close();
            fos.flush();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
