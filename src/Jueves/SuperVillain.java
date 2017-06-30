
package Jueves;

public class SuperVillain implements SuperPowers
{
    protected String[] powers;
    protected String name;
    
    public SuperVillain(String superVillano)
    {
        this.name = superVillano;
    }
    
    @Override
    public void powers() 
    {
        System.out.println("Lista de poderes: ");
        for (String arrPodere : this.powers) 
        {
            System.out.println(arrPodere);
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
