public class TesteOperacoesArray {
    public static void main(String[] args) {
        int[] numeros = {3, 8, 12, 7, 20, 5, 10, 15, 18, 25};
        int x = 10;

        if (numeros.length < 2) { //verifica se o array tem pelo menos 2 elementos
            System.out.println("O array deve ter pelo menos dois elementos");
            return;
        }

        //chama os métodos da classse OperacoesArray
        int[] parPosicoes = OperacoesArray.ParPosicoesMaiorDiferenca(numeros);
        String ordem = OperacoesArray.verificarOrdem(numeros);
        int[] contagem = OperacoesArray.contarNumeros(numeros, x);

        System.out.println("Par de posições com maior diferença: " + parPosicoes[0] + " e " + parPosicoes[1]);
        System.out.println("O array está em ordem:" + ordem);
        System.out.println("Números maiores que " + x + ": " + contagem[0]);
        System.out.println("Números menores que " + x + ": " + contagem[1]);
        System.out.println("Números iguais a " + x + ": " + contagem[2]);
    }
}
