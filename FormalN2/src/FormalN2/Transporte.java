package FormalN2;

public abstract class Transporte {
    protected double velocidade;
    protected boolean ligado;

    public Transporte(){
        velocidade = 0;
        ligado = false;

    }
    public void setVelocidade(double velo){
        velocidade = velo > 0 ? velo : 0.0;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public boolean isLigado(){
        if(ligado == true){
            return true;
        }
        else{
            return false;
        }
    }
    public void liga() {
        if (ligado == true) {
            System.out.println("O carro já está ligado!!!");

        } else {
            ligado = true;
        }
    }
    public void desliga() {
        if (ligado == false) {
            velocidade = 0;
            System.out.println("O carro já está desligado!!!");

        } else {
            ligado = false;
        }
    }

    @Override
    public String toString() {
        return String.format("O veículo está %b e com a velocidade %f", isLigado(), velocidade);
    }

    public abstract void acelera();

    public abstract void freia();


}
