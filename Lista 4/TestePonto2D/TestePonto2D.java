public class TestePonto2D {
    public static void main(String[] args) {
        Ponto2D pontoUm= new Ponto2D();
        Ponto2D pontoDois= new Ponto2D(1, 2);

        System.out.println("PONTO 1:("+pontoUm.getX()+","+pontoUm.getY()+")"); //printa o ponto 1
        System.out.println("PONTO 2:("+pontoDois.getX()+","+pontoDois.getY()+")"); //printa o ponto 2

        System.out.println("Quantidade de pontos criados:"+Ponto2D.getContador()); // printa quantos pontos foram criados
    }
}
