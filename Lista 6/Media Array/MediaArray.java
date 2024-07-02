public class MediaArray {
    public static void main(String[] args) {

        double[] numeros = {10.0, 20.5, 30.0, 40.5, 50.0};
        double media = 0.0;
        double soma = 0.0;

        for (int i = 0; i < numeros.length; i++) { //percorre o array para somar os números
            soma += numeros[i];
        }

        media = soma / numeros.length; //calcula a média dos números

        System.out.println("A média dos números é: " + media);
    }
}