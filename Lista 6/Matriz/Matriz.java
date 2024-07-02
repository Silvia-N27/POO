public class Matriz {
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        int contador = 0;

        for (int linha = 0; linha < 3; linha++) { //colocar números na matriz
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = contador;
                contador++;
            }
        }

        //mostrar a matriz
        System.out.println("Matriz A de ordem 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
