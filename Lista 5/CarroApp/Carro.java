public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Bancos bancos;

    Carro(String marca, String modelo, String fabricante, Motor motor, Bancos bancos){ //construtor
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }

    @Override //sobrescreve o toString()
    public String toString() {
        return "\nFabricante: " + fabricante + "\nMarca: " + marca + "\nModelo: " + modelo +
               "\nTipo do Motor: " + motor.getTipo() + "\nBancos: " + bancos.getFabricante();
    }
}
