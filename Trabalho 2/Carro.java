public class Carro extends Veiculo {
    private int ano;

    public Carro(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ano: " + ano);
    }
}