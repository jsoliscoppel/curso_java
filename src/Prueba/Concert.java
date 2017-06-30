
package Prueba;

import java.io.File;
import static java.lang.Thread.State.TIMED_WAITING;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Concert extends Thread
{
    File[] files;
    File path;
    String dir;
    LoadImageApp img;
    Music music;
    
    public Concert(Music m)
    {
        this.music = m;
    }
    
    @Override
    public void run()
    {
        this.music.start();
        while(this.music.getState() == TIMED_WAITING)
        {
            this.loadImage(this.getFiles());
        }        
        

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
                Concert.sleep(1000);
                f.remove(img);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie.getMessage());
            }
        }
        
    }
}
