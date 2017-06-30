
package Miercoles;


public class Flash implements Poderes {

    private String name = "Flash";
    public Flash() {
    }

    @Override
    public void velocidad() {
        System.out.println(this.name + " tiene súper velocidad");
    }

    @Override
    public void resistencia() {
       System.out.println(this.name + " tiene súper resistencia");
    }

    @Override
    public void volar() {
       System.out.println(this.name + " no tiene la capacidad de volar");
    }

    @Override
    public void fuerza() {
        System.out.println(this.name + " no tiene súper fuerza");
    }
    
    @Override
    public void ataque(){
        System.out.println(this.name + " ataca con besos");
    }
    @Override
    public void especial(){
        System.out.println(this.name + " ataca con besos a toda velocidad");
    }
    public void mostrarPoderes(){
        System.out.println(this.name + " Tiene los siguientes poderes: ");
        this.volar();
        this.fuerza();
        this.resistencia();
        this.velocidad();
    }
    
    
}
