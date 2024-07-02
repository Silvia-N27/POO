public class Turma {
    private String curso;
    private String disciplina;

    public Turma(String cursoUm, String disciplinaUm){ //construtor é usado para criar o objeto ja passando atributos pra ele
        curso=cursoUm;
        disciplina=disciplinaUm;
    }

    public void setCurso(String cursoUm){ //modificar o atributo curso
        curso=cursoUm;
    }

    public void setDisciplina(String disciplinaUm){ //modificar o atributo disciplina
        disciplina=disciplinaUm;
    }

    public String getCurso(){ //exibir nome do curso
        return curso;
    }

    public String getDisciplina(){ //exibir nome da disciplina
        return disciplina;
    }

    public void exibirMensagem(){
        System.out.println("Curso:"+getCurso()+"\nDisciplina:"+getDisciplina()); //exibir as informações

    }
}
