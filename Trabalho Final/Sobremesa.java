public class Sobremesa extends Prato {
    public Sobremesa(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularTaxaServico() {
        return getPreco() * 0.05;
    }
}