package FormalN2;

public class Onibus extends Transporte{
    protected int quantidadePassageiros;

    public Onibus(int quantidadePassageiros){
        velocidade = 0;
        ligado = false;
        setQuantidadePassageiros(quantidadePassageiros);
    }

    public void setQuantidadePassageiros(int quant) {
        quantidadePassageiros = quant > 0 && quant < 50 ? quant : 0;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setVelocidade(double velo){
        velocidade = velo > 0 && velo < 180 ? velo : 0.0;
    }


    @Override
    public void acelera() {
        if (ligado == true){
            velocidade = velocidade + 6;
        }

    }

    @Override
    public void freia() {
        if (ligado == true){
            velocidade = velocidade - 4;
        }
    }


    @Override
    public String toString() {
        return super.toString() + " e Com " + quantidadePassageiros + " Passageiro(s)";
    }
}
