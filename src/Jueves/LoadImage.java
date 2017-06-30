
package Jueves;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class LoadImage extends Component 
{
    BufferedImage img;

    @Override
    public void paint(Graphics g) 
    {
        g.drawImage(img, 0, 0, 500, 500, null);
    }

    public LoadImage(File file) 
    {
       try 
       {
           img = ImageIO.read(file);
       } 
       catch (IOException e) 
       {
           System.out.println(e.getMessage());
       }

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
