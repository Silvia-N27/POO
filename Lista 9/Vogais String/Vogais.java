public class Vogais{
    private String palavra;
    public Vogais(String palavra){
        this.palavra=palavra;
    }

    public static String calcularVogais(String palavra){
        int tamanho = palavra.length();
        int aux = 0;
        String palavraMini = palavra.toLowerCase();

        for(int i = 0; i < palavra.length(); i++){
            if(palavraMini.charAt(i) == 'a' || palavraMini.charAt(i) == 'e' || palavraMini.charAt(i) == 'i' || palavraMini.charAt(i) == 'o' || palavraMini.charAt(i) == 'u'){
                aux++;
            }
        }
        return "Tamanho: " + tamanho + "\nQuantidade de vogais: " + aux;
    }
}