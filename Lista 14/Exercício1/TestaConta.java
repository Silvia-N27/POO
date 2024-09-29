public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jeremias", "Antunes");
        Conta conta1 = new Conta(3954, 8000, 2000, cliente1);

        try {
            conta1.saca(11000);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Saldo insuficiente");
        } catch (ValorNegativoException valorNegativoException) {
            System.out.println(valorNegativoException.toString());
        }

        try {
            conta1.deposita(-2);
        } catch (ValorNegativoException valorNegativoException) {
            System.out.println(valorNegativoException.toString());
        }

        System.out.println("Dados conta1: " + "\n" + conta1.toString());
    }
}