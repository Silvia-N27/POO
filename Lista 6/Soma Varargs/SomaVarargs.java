public class SomaVarargs {
    public static void main(String[] args) {
        int resultado1 = soma(1, 2, 3, 4, 5);
        int resultado2 = soma(10, 20, 30, 40);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }

    public static int soma(int... valores) { //soma os valores passados como varargs
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }
}