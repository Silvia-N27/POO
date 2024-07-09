public class UsaOficina {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        
        Veiculo veiculo1 = oficina.proximo();
        oficina.revisar(veiculo1);

        Veiculo veiculo2 = oficina.proximo();
        oficina.revisar(veiculo2);
    }
}