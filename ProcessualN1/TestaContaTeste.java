package ProcessualN1;

public class TestaContaTeste {
    public static void main(String[] args) {

        TesteConta conta = new TesteConta("Davy");
        TesteConta destino = new TesteConta("Duda");



        conta.deposito( 500);
        destino.deposito( 1000);
        destino.retirada( 20);
        conta.transferencia(destino, 75);


        conta.displayMessageSaldo();
        destino.displayMessageSaldo();
        destino.displayMessageSaldo();



    }

}
