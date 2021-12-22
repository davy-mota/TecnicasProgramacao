package Prova;


public class NumeroPerfeito {
    public static boolean perfeito2(int numero) {
        int soma, i;
        double raiz = Math.sqrt(numero);
        soma = 1;
        for (i = 2; i < raiz; ++i)
            if (numero % i == 0)
                soma += i + numero / i;
        if (raiz == (int) raiz)
            soma += (int) raiz;
        return numero == soma;
    }

    public void displayMessage() {
        System.out.println(perfeito2(7));
    }

    public static void main(String[] args) {
        NumeroPerfeito perfeito = new NumeroPerfeito();

        perfeito.displayMessage();
    }
}