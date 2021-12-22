package Formal;

public class DisciplinaPos {

    int DisciplinaPos[];
    private int creditos;
    private int totalAlunos = 0;
    private boolean especialização;
    private String disciplina;



    public DisciplinaPos(String nome, String d, int c, boolean e) {
        super(nome);
        setDisciplina(d);
        setCreditos(c);

    }
    DisciplinaPos [] alunos  =  new DisciplinaPos[30];
    public void setDisciplina(String d) {
        if (d == "Pos") {
            disciplina = "Pos";
        } else {
            System.out.println("Somente alunos de Pós-Graduação podem se inscrever em disciplinas de pós-graduação.");
        }
    }

    public void setCreditos(int cred) {
        creditos = cred == 2 || cred == 4 || cred == 6 ? cred : 0;
    }
    public void incluiAluno(int a){

        boolean adicionado = true;
        if(this.totalAlunos<30) {
            for(int i =0; i< this.totalAlunos; i++) {
                if(alunos[i].equals(a)) {
                    adicionado = false;
                }
            }

            if(adicionado) {
                alunos[this.totalAlunos]=a;
                this.totalAlunos++;
                System.out.println("O aluno foi adicionado com sucesso!");
            }
        }
        else {
            System.out.println("O aluno não foi adicionado, a sala está com a capacidade máxima!");
        }

    }

    public static void main(String[] args) {


        DisciplinaPos d = new DisciplinaPos("Davy", "Pos", 2, false);
    }
}


