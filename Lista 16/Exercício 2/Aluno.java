public class Aluno implements Falante {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void falar() {
        System.out.println("Oie, eu sou aluno(a) de Matemática Aplicada e Computacional!");
    }

    @Override
    public String seuIdioma() {
        return "Português";
    }

    public void identificarSe() {
        System.out.println("Eu sou o(a) aluno(a) " + nome);
    }
}