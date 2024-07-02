public class CD extends Produto {
    private int faixas;

    public CD(String nome, double preco, int faixas) {
        super(nome, preco);
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return super.toString() + "; Número de faixas: " + faixas;
    }
}