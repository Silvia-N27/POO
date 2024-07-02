public class OperacoesArray {
    public static int[] ParPosicoesMaiorDiferenca(int[] array) {
        int maiorDiferenca = 0;
        int posicaoInicio = 0;
        int posicaoFim = 0;

        for (int i = 0; i < array.length - 1; i++) { //percorre o array para encontrar a maior diferença
            int diferenca = (array[i] - array[i + 1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                posicaoInicio = i;
                posicaoFim = i + 1;
            }
        }
        return new int[]{posicaoInicio, posicaoFim};
    }
    public static String verificarOrdem(int[] array) { //método para verificar a ordem do array
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                crescente = false;
            if (array[i] < array[i + 1])
                decrescente = false;
        }

        if (crescente)
            return "crescente";
        else if (decrescente)
            return "decrescente";
        else
            return "não ordenado";
    }

    public static int[] contarNumeros(int[] array, int x) { //metódo para contar os números maiores, menores e iguais a x
        int maioresX = 0;
        int menoresX = 0;
        int iguaisX = 0;

        for (int num : array) {
            if (num > x)
                maioresX++;
            else if (num < x)
                menoresX++;
            else
                iguaisX++;
        }

        return new int[]{maioresX, menoresX, iguaisX};
    }
    
}
