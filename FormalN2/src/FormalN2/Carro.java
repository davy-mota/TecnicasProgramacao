package FormalN2;

public class Carro extends Transporte{
    protected int quilometragem;

    public Carro(){
        velocidade = 0;
        ligado = false;
        quilometragem = 0;

    }

    public void setQuilometragem(int quilo) {
        quilometragem = quilo > 0 && quilo < 9999 ? quilo : 0;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setVelocidade(double velo){
        velocidade = velo > 0 && velo < 250 ? velo : 0.0;
    }


    @Override
    public void acelera() {
        if (ligado == true){
            velocidade = velocidade + 7.5;
        }

    }

    @Override
    public void freia() {
        if (ligado == true){
            velocidade = velocidade - 6;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " e Quilometragem " + quilometragem;
    }
}
