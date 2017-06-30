
package Jueves;

public class Luthor extends SuperVillain
{
    
    public Luthor() 
    {
        super("Luthor");
        this.setAttacks();
    }

    private void setAttacks()
    {
        String[] attacks = {
            "Súper golpe", 
            "Rasho lasser", 
            "Cañon sónico",
            "Golpe",
            "Patada"
        };
        
        this.powers = attacks;
    }
    
    
}
