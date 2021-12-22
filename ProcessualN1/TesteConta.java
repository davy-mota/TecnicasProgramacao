package ProcessualN1;

/*
b)	Crie uma classe chamada TestaConta para criar contas para pessoas. Nessa
classe você deve criar duas contas diferentes e realizar as seguintes opções:
- depósito de 500 na primeira
- depósito de 1000 na segunda
- retirar 20 da segunda conta
- transferir 75 da segunda para a primeira
- mostrar o saldo final de cada conta.

*/
public class TesteConta {

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

    public void transferencia(Conta destino, double quantia) {

        this.saque(quantia);
        destino.deposito(quantia);

    }

    public void displayMessageSaldo() {
        System.out.println("Saldo: " + saldo + " Titular: " + nome);
    }

}


