public class SoproMadeira implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento sopro madeira");
    }

    @Override
    public void nome() {
        System.out.println("Sopro Madeira");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento sopro madeira");
    }
}