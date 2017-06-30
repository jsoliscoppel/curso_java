
package Miercoles;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class LoadImageApp extends Component {
    BufferedImage img;

    @Override
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp() {
       try {
           String image = "C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\src\\files\\demon.jpg";
           
           img = ImageIO.read(new File(image));
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
       }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}
