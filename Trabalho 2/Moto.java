public class Moto extends Veiculo {
    private double km;

    public Moto(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Quilometragem: " + km);
    }
}