package FormalN2;

public class informacaoDoProcesso {

    int y = 20;

    try{

        int result = avalia(y);

    }catch (IllegalArgumentException e) {
        System.out.println("Argumento inválido");

    }
    System.out.println(result);

}
