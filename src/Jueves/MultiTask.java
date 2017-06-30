
package Jueves;


public class MultiTask extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args)
    {
        MultiTask t1 = new MultiTask(),
                  t2 = new MultiTask(),
                  t3 = new MultiTask();
        t1.start();
        t2.start();
        t3.start();
    }
}
