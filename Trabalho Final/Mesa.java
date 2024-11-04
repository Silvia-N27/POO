public class Mesa {
    private int numero;
    private boolean ocupada;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + " está " + (ocupada ? "ocupada" : "desocupada"); //(operador ternário) verifica se ocupada é true ou false, se for true retorna "ocupada" se for false retorna "desocupada"
    }
}