public class Cartas {
    private Naipe naipe;
    private Valor valor;

    public Cartas(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " DE " + naipe;
    }
}