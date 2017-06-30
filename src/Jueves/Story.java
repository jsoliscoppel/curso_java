
package Jueves;

public class Story extends Thread
{
    @Override
    public void run()
    {
        SuperHero flash     = new Flash();
        SuperVillain luthor = new Luthor();

        try
        {
            for( int i = 0; i < 10; i++ )
            {
                flash.attack();
                Story.sleep(2000);
                luthor.attack();
                Story.sleep(2000);
            }
            System.out.println("Fin");
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
