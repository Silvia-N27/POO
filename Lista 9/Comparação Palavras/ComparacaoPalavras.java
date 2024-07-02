public class ComparacaoPalavras {
    private String palavra1;
    private String palavra2;
    public ComparacaoPalavras(String palavra1, String palavra2) {
        this.palavra1 = palavra1;
        this.palavra2 = palavra2;
    }

    public static void compararPalavras(String palavra1, String palavra2) {
        System.out.println("Comparação com equals:");
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras são iguais");
        }
        else {
            System.out.println("As palavras são diferentes");
        }

        System.out.println("\nComparação com equalsIgnoreCase:");
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais");
        }
        else {
            System.out.println("As palavras são diferentes");
        }
    }
}