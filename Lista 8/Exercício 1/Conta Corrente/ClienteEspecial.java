public class ClienteEspecial extends ContaCorrente {
    
    public ClienteEspecial(double saldo){
        super(saldo);
    }

    @Override
    public double taxaOperacao(double quantia){
        return quantia*0.001;
    }
}
