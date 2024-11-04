public class MesaIndisponivelException extends Exception {
    public MesaIndisponivelException(String mensagem) {
        super(mensagem); //chama o construtor da classe exception para inicializar com a mensagem que foi recebida
    }
}