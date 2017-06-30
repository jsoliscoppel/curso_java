
package Miercoles;

abstract class Banco {
    abstract int getTasaDeInteres();
}

class HSBC extends Banco{

    @Override
    int getTasaDeInteres() {
        return 7;
    }
    
}

class Bancoppel extends Banco{

    @Override
    int getTasaDeInteres() {
        return 9;
    }
    
}
class Bancomer extends Banco{
    @Override
    int getTasaDeInteres(){
        return 8;
    }
}

class PruebaBanco {
    public static void main(String[] args){
        Banco b;
        
        b = new HSBC();
        System.out.println(b.getTasaDeInteres());
        b = new Bancoppel();
        System.out.println(b.getTasaDeInteres());
        b = new Bancomer();
        System.out.println(b.getTasaDeInteres());
    }
}
