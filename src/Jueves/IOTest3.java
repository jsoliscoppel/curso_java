
package Jueves;

import java.io.FileInputStream;


public class IOTest3 
{
    String file = "C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\magia.txt";
    
    public static void main(String[] args) {
        IOTest3 test = new IOTest3();
        test.leer3();
    }
    
    public void leer()
    {
        try 
        {
            FileInputStream fis = new FileInputStream(this.file);
            int i = fis.read();
            System.out.println( (char) i);
            fis.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    public void leer2()
    {
        try 
        {
            FileInputStream fis = new FileInputStream(this.file);
            int i = 0;
            while( (i = fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void leer3()
    {
        try 
        {
            FileInputStream fis = new FileInputStream(this.file);
            int i = 0;
            while( (i = fis.read()) != -1){
                System.out.print(i);
            }
            fis.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
}
