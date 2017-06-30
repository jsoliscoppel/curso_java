
package Prueba;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.Arrays;
import javax.imageio.*;

public class LoadImageApp extends Component
{
    BufferedImage img;
    
    public LoadImageApp(File file) 
    {
       try 
       {
           img = ImageIO.read(file);
       } 
       catch (IOException e) 
       {
           System.out.println(Arrays.toString(e.getStackTrace()));
       }
 
    }
 
    @Override
    public void paint(Graphics g) 
    {
        g.drawImage(img, 0, 0, 500, 500, this);
    }
    
    @Override
    public Dimension getPreferredSize() 
    {
        if (img == null) 
        {
            return new Dimension(100,100);
        } 
        else 
        {
            //return new Dimension(img.getWidth(null), img.getHeight(null));
            return new Dimension(500, 500);
        }
    }
    
    
}
