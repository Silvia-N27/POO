public class SoproMetal implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento sopro metal");
    }

    @Override
    public void nome() {
        System.out.println("Sopro Metal");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento sopro metal");
    }
}