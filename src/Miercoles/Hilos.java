
package Miercoles;


public class Hilos implements Runnable {
    @Override
    public void run(){
        System.out.println("El hilo runnable esta corriendo");
    }
    
    public static void main(String[] args){
        Hilos h = new Hilos();
        Thread thread = new Thread(h);
        thread.start();
    }
}


