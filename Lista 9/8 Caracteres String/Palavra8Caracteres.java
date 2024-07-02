public class Palavra8Caracteres{
    private String palavra;

    public Palavra8Caracteres(String palavra){
        this.palavra = palavra;
    }

    public static String formarPalavra(String palavra){
        if (palavra.length() < 8){
            return "ERRO!! a palavra precisa ter no mínimo 8 caracteres";
        }
        String novaPalavra = palavra.substring(0, 2) + palavra.substring(palavra.length() - 2);
        return novaPalavra;
    }
}