
package Viernes;

import java.io.File;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Images extends Thread
{
    File[] files;
    File path;
    String dir;
    LoadImageApp img;
    
    @Override
    public void run()
    {
        this.loadImage(this.getFiles());
    }
    
    private File[] getFiles()
    {
        try
        {
            dir   = "C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\src\\images\\";
            path  = new File(dir);
            files = path.listFiles();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return files;
    }
    
    private void loadImage(File[] files)
    {
        JFrame f = new JFrame("Concierto");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        for (File file : files) 
        {
            try 
            {
                img = new LoadImageApp(file);
                f.add(img);
                f.pack();
                f.setVisible(true);
                Images.sleep(1000);
                f.remove(img);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
        
    }
}
