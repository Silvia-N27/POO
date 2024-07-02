public class TesteProcessamento {
    public static void main(String[] args) {
        String teste1 = "teste";
        String teste2 = null;
        
        String resultado1 = Processamento.processar(teste1);
        System.out.println(teste1 + ": " + resultado1);
        
        String resultado2 = Processamento.processar(teste2);
        System.out.println("null: " + resultado2);
    }
}