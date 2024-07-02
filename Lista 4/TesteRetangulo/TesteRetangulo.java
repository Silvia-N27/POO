public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo retanguloUm = new Retangulo(); //criando objeto
        Retangulo retanguloDois = new Retangulo(5, 7); //criando outro objeto

        //mostrar a area e perimetro do primeiro retângulo
        retanguloUm.exibirArea();
        retanguloUm.exibirPerimetro();

        //mostrar a area e o perímetro do segundo retângulo
        retanguloDois.exibirArea();
        retanguloDois.exibirPerimetro();
    }

}