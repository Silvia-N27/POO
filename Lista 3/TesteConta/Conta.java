public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        if(saldoInicial>0)
            saldo = saldoInicial;
        else
            saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public void creditar(double quantia){
        saldo += quantia;
    }

    public void debitar(double quantia){
        if(quantia>=saldo)
            System.out.println("FALHA AO DEBITAR: QUANTIA DE DÉBITO É MAIOR QUE O SALDO DA CONTA");
        else
            saldo -= quantia;
    }
}