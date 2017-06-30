
package Miercoles;


interface Mostrar {
    void show();
}

public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args){
        Interfaz i = new Interfaz();
        i.show();
    }
    
}
