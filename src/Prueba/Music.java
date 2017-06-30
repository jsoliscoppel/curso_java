package Prueba;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music extends Thread
{
    private String audio;
    private File file;
    private Clip clip;
    private long len;
    private AudioInputStream ais;

       
    @Override
    public void run()
    {
        this.startMusic();
    }
    
    private void startMusic()
    {
        
        try
        {        
            audio = "C:\\Users\\ALUMNO\\Documents\\NetBeansProjects\\JavaAvanzado\\src\\audio\\borntobewild.wav";
            file  = new File(audio);
            ais   = AudioSystem.getAudioInputStream(file);
            clip  = AudioSystem.getClip();
            len   = clip.getMicrosecondLength();
            
            clip.open(ais);
            clip.start();
            
            Music.sleep(len);         
     
        }
        catch(UnsupportedAudioFileException | InterruptedException | LineUnavailableException | IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
