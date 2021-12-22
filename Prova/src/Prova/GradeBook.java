package Prova;

public class GradeBook {

    private String courseName;
    private int qteAlunos;
    private String professor;

    public GradeBook(int qte) {

        qteAlunos = qte;


    }
    public void displayMessage() {
        System.out.println("Welcome to the Grade Book of class "+getprofessor()+"!");
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String name) {
        courseName = name;
    }
    public String getprofessor() {
        return professor;
    }
    public void setProfessor(String nome){
        if (getprofessor() == null){
            professor = nome;
        }
    }

    public int getQteAunos() {
        return qteAlunos;
    }

    public void setQteAlunos(int qte) {
        qteAlunos = qte;
    }

}
