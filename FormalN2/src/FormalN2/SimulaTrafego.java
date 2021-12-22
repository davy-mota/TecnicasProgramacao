package FormalN2;

import java.util.Arrays;

public class SimulaTrafego {
    public static void main(String[] args) {


        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Onibus o1 = new Onibus(25);
        Onibus o2 = new Onibus(15);

        c2.setQuilometragem(2000);
        c2.liga();
        c2.acelera();
        c2.acelera();
        c2.freia();
        System.out.println(c2);

        c1.liga();
        o1.liga();
        o2.liga();

        Transporte [] transportes = {c1, c2, o1, o2};

        for(Transporte t: transportes){
            t.acelera();
            t.acelera();
            t.acelera();
            t.acelera();
            t.acelera();
            t.acelera();
            t.acelera();
            t.acelera();

            System.out.printf(t.toString());
        }

    }
}
