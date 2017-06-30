
package Jueves;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Images extends Thread{
    public Images()
    {
        this.loadImage(this.getFiles());
    }
    public File[] getFiles()
    {
        String path = "C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\src\\files";
        File dir = new File(path);
        File[] listOfFiles = dir.listFiles();
        return listOfFiles;
    }
    public void loadImage(File[] files)
    {
        JLabel text;
        JFrame f = new JFrame("Comic");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = f.getContentPane();
        container.setLayout(new FlowLayout());
        
        SuperHero flash     = new Flash();
        SuperVillain luthor = new Luthor();
        boolean turn = true;
        try
        {     
            for (File file : files) 
            {
                LoadImage img = new LoadImage(file);
                text = turn? new JLabel(flash.attack()) : new JLabel(luthor.attack());
                container.add(img);
                container.add(text);
                f.setVisible(true);
                Images.sleep(2000);
                container.remove(img);
                container.remove(text);
                turn = turn? false : true;
            }
     
            f.dispose();
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie.getMessage());
        }
    }
}
