public class Percussao implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento percussão");
    }

    @Override
    public void nome() {
        System.out.println("Percussão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento percussão");
    }
}