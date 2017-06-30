package Miercoles;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class Images extends Component {
    BufferedImage img;
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public Images(File image) {
       try {
    
           //if ( image.exists()){ System.out.println("Existe");}
           img = ImageIO.read(image);
           //System.out.println(img.getHeight());
           int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();
           BufferedImage resizedImg = new BufferedImage(500, 500, type);
           ImageIO.write(resizedImg, "jpg", image);
           
       } catch (IOException e) {
           System.out.println(e);
       }

    }

    @Override
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
           //return new Dimension(img.getWidth(), img.getHeight());
       }
    }



}
