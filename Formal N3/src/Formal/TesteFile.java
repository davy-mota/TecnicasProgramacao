package Formal;

import java.io.File;
import java.util.Scanner;

public class TesteFile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        analisaCaminho(entrada.nextLine());

    }


    public static void analisaCaminho(String path) {
        File nome = new File(path);
        if (nome.exists()) {
            System.out.println("Encontrado: " + nome.getName());
            System.out.println(nome.isFile() ? "É um arquivo" : "Não é um arquivo");
            System.out.println(nome.isDirectory() ? "É um diretório" : "Não é um diretório");
            System.out.println(nome.isFile() ? "É um caminho absoluto" : "Não é um caminho absoluto");
            System.out.println("Ultima alteração: " + nome.lastModified());
            System.out.println("Caminho: " + nome.getAbsolutePath());

            if (nome.isDirectory()){
                String [] conteudo = nome.list();

                System.out.println("Conteudo do diretório");

                for(String content: conteudo){
                    System.out.println(content);
                }
            }
        }
        else {
            System.out.printf("%s não existe!!!", path);
        }

    }





}
