package Prova;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {


        GradeBook myGradeBook = new GradeBook( 5);
        GradeBook meuLivroDeNotas = new GradeBook( 15);

        myGradeBook.setProfessor("Davy");
        myGradeBook.setProfessor("Duda");
        myGradeBook.displayMessage();
        meuLivroDeNotas.displayMessage();


    }
}

