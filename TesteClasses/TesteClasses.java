public class TesteClasses {
    public static void main(String[] args) {
        Aluno aluno=new Aluno();
        Universidade universidade=new Universidade();   //cria uma variável universidade

        aluno.nomeAluno="Cleiton";
        aluno.curso="Química";
        universidade.nomeUni="UNICENTRO CEDETEG";
        universidade.cidade="Guarapuava";
        universidade.estado="Paraná";

        aluno.ExibeDadosAluno();
        universidade.ExibeDadosUni();   //puxa a função para printar os dados

    }
}