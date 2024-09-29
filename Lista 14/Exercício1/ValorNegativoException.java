public class ValorNegativoException extends Exception {

    @Override
    public String toString() {
        return "ERRO!!! Não é possível fazer depósito ou saque com valor negativo";
    }
}
