public class ContaCorrente{
    protected double saldo;

    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double quantia){
        if(quantia<=0){
            System.out.println("Quantia mínima para depositar: R$0,01");
        }
        else{
            saldo += quantia;
        }
    }

    public double taxaOperacao(double quantia){
        return quantia*0.005;
    }

    public boolean sacar(double quantia){
        if(quantia<=0){
            System.out.println("Quantia mínima para saque é: R$ 0,01");
            return false;
        }
        double tx = taxaOperacao(quantia);
        if(saldo>=quantia+tx){
            saldo -=quantia+tx;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente para o saque");
            return false;
        }
    }


}