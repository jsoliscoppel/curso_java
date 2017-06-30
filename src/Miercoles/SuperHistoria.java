
package Miercoles;


public class SuperHistoria extends Thread {
    
    @Override
    public void run(){
        boolean flag = true;
        Flash flash = new Flash();
        Luthor luthor = new Luthor();
        boolean esp_flash = true;
        boolean esp_luthor = true;
        for (int i = 0; i < 4; i++ )
        {
            try{
                
                if ( flag )
                {
                    if ( esp_flash )
                    {
                        flash.ataque();
                        esp_flash = false;
                    }
                    else
                    {
                        flash.especial();
                        esp_flash = true;
                    }
                    flag = false;
                }
                else
                {
                    if ( esp_luthor )
                    {
                        luthor.ataque();
                        esp_luthor = false;
                    } 
                    else
                    {
                        luthor.especial();
                        esp_luthor = true;
                    }
                    flag = true;
                }
                
                this.sleep(2000);
                if ( i == 3){ System.out.println("Fin");  break;}
            }
            catch(InterruptedException ie)
            {
                ie.getStackTrace();
            }
        }
    }
}

