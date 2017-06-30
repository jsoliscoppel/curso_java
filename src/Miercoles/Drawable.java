
package Miercoles;

public interface Drawable {
    void draw();
}

class SuperHeroe implements Drawable{
    public void draw(){
        System.out.println("Dibujando a superman");
    }
}

class SuperVillano implements Drawable{
    public void draw(){
        System.out.println("Dibujando a Lex Luthor");
    }
}

class Historia{
    public static void main(String[] args){
        Drawable sh = new SuperHeroe();
        Drawable sv = new SuperVillano();
        
        sh.draw();
        sv.draw();
    }
}
