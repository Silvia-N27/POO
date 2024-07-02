public class TesteComparacaoPalavras {
    public static void main(String[] args) {
        String palavra1 = "Teste";
        String palavra2 = "teste";

        ComparacaoPalavras comparador = new ComparacaoPalavras(palavra1, palavra2);
        comparador.compararPalavras(palavra1, palavra2);
    }
}