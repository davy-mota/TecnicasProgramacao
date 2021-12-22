package Formal;

public class DisciplinaGrad {
    int DisciplinaPos[];
    private int cargaHoraria;
    private String Disciplina;

    public DisciplinaGrad (String nome, String d, int ch){
        super(nome);
        setDisciplina(d);
        setCargaHoraria(ch);

    }
    public void setDisciplina(String d) {
        if (d == "Grad") {
            disciplina = "Grad";
        } else {
            System.out.println("Somente alunos de Graduação podem se inscrever em disciplinas de graduação.");
        }
    }
    DisciplinaPos [] alunos  =  new DisciplinaPos[30];

    public void setCargaHoraria(int ch) {
        cargaHoraria = ch < 20 ? ch : 0;
    }
}
