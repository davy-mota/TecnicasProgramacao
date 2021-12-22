package Conta;

public class Conta  {

    double saldo = 0;
    String nome;


    public Conta(String nome){
        this.nome = nome;


    }


    public double saldoInicial(double saldo) {
        return saldo;
    }

    void deposito (double quantia) {
        saldo = saldoInicial(saldo);
        saldo= saldo + quantia;
    }
    void saque (double quantia) {

         saldo = saldo - quantia;
    }
    void transferir(double quantia, Conta destino) {
        this.saque(quantia);
        destino.deposito(quantia);
    }



    void mostraSaldo () {
        System.out.println("Saldo R$ " + saldo + " Titular: " + nome);
    }

    public static void main(String[] args) {
        Conta conta = new Conta("Davy");
        Conta destino = new Conta("Duda");

        conta.saldoInicial(50);
        conta.deposito(100);
        conta.saque(20);
        conta.transferir(10, destino);
        conta.mostraSaldo();
        destino.mostraSaldo();

    }


}

