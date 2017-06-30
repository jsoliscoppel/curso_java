
package Jueves;


public class ThreadG implements Runnable
{

    @Override
    public void run() {
        
    }
    
    public static void main(String[] args)
    {
        ThreadG threadG = new ThreadG();
        ThreadGroup tg1 = new ThreadGroup("Grupo de hilos");
        
        Thread t1 = new Thread(tg1, threadG, "uno");
        t1.start();
        Thread t2 = new Thread(tg1, threadG, "dos");
        t2.start();
        Thread t3 = new Thread(tg1, threadG, "tres");
        t3.start();
        
        System.out.println("Thread Group: " + tg1.getName());
        tg1.list();
    }
}

