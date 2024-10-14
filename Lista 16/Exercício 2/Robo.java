public class Robo implements Falante {
    private String modelo;

    public Robo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void falar() {
        System.out.println("Oie, eu sou um Robô, modelo:" + modelo);
    }

    @Override
    public String seuIdioma() {
        return "Francês";
    }

    public void reboot() {
        System.out.println("Reniciando o robô...");
    }
}