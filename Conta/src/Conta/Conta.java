package Conta;

public class Conta  {

    double saldo;
    String nome;

    public Conta(String nome){
        this.nome = nome;

    }

    private void saldoInicial(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoInicial(){
        return saldo;
    }

    void deposito (double quantia) {
        saldo = getSaldoInicial();
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

    //=======================Teste do Código=========================

    public static void main(String[] args) {
        Conta conta = new Conta("Davy");
        Conta destino = new Conta("Duda");

        conta.saldoInicial(50);
        destino.saldoInicial(100);
        conta.deposito(100);
        conta.saque(20);
        conta.transferir(10, destino);
        conta.mostraSaldo();
        destino.mostraSaldo();

    }


}