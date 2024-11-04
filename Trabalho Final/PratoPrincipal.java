public class PratoPrincipal extends Prato {
    public PratoPrincipal(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularTaxaServico() {
        return getPreco() * 0.10;
    }
}