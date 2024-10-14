public class Sopro implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Tocando instrumento sopro");
        
    }

    @Override
    public void nome() {
        System.out.println("Sopro");
        
    }

    @Override
    public void tocar() {
        System.out.println("Afinando instrumento sopro");
        
    }
    
}
