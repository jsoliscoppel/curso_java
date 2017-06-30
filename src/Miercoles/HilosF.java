
package Miercoles;


public class HilosF extends Thread {
    
    @Override
    public void run(){
        for ( int i =1; i<5; i++){
            try{
                System.out.println(i);
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                ie.getStackTrace();
            }
        }
    }
    
    public static void main(String[] args){
        HilosF f = new HilosF();

        Thread thread = new Thread(f);
        thread.start();
    }
}
