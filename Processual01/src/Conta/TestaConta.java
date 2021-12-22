package Conta;

class TesteConta {

    public double saldo;
    public double conta;
    String nome;

    public TesteConta(String nome) {
        this.nome = nome;
    }


    public void deposito(double quantia) {

        saldo += quantia;
        conta = saldo;

    }

    public void retirada(double quantia) {

        this.saldo = saldo;
        this.saldo -= quantia;
        conta = this.saldo;
    }

    public void transferencia(TesteConta destino, double quantia) {

        this.retirada(quantia);
        destino.deposito(quantia);

    }

    public void displayMessageSaldo() {
        System.out.println("Saldo: " + saldo + " Titular: " + nome);
    }
}



