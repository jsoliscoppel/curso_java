package Jueves;


public class Flash extends SuperHero
{ 
    public Flash() 
    {
        super("Flash");
        this.setAttacks();
    }
    
    private void setAttacks()
    {
        String[] attacks = {
            "Súper velocidad", 
            "Fuerza de velocidad", 
            "Golpe a la velocidad del sonido",
            "Golpe",
            "Patada"
        };
        
        this.powers = attacks;
    }

}
