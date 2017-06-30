package Jueves;

public class SuperHero implements SuperPowers
{
    protected String[] powers;
    protected String name;
    
    public SuperHero(String superHeroe)
    {
        this.name = superHeroe;
    }
    
    @Override
    public void powers() 
    {
        System.out.println("Lista de poderes: ");
        for (String power : this.powers) 
        {
            System.out.println(power);
        }
    }

    @Override
    public String attack() 
    {
        int random = (int) (Math.random() * this.powers.length);
        System.out.println(this.name + " ataca con " + this.powers[random]);
        return this.name + " ataca con " + this.powers[random];
    }
    
}
