package Prova;

public class Professor {
    String professor;
    String titulaçao;
    int qtdDisciplinas;
    String listaDisciplinas;

    public Professor (String nomeProfessor, String titulaçao){
        this.professor = nomeProfessor;
        this.titulaçao = titulaçao;


    }
    public String getProfessor() {
        return professor;
    }

    public void setnomeProfessor(String name) {
        professor = name;
    }
    public String getTitulaçao() {
        return titulaçao;
    }

    public void setTitulaçao(String name) {
        titulaçao = name;
    }
    public int getQtdDisciplinas() {
        return qtdDisciplinas;
    }

    public void setQtdDisciplinas(int qtd) {
        qtdDisciplinas = qtd;
    }
    public String toString() {
        return String.format("Titulação: "+titulaçao+ " Professor: "+professor+ "%d",
                getQtdDisciplinas());
    }
    public void displayMessage() {
        System.out.println("Professor: "+professor+" Titulação: "+titulaçao+"Disciplina: "+listaDisciplinas);
    }
    public static void main(String[] args) {
        Professor matematica = new Professor("João", "Graduado");

        matematica.displayMessage();

    }

}

