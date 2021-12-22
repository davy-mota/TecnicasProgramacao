public class Estoque {



    int Estoque[];

    private int totalProduto = 0;
    private int cod;
    private int produto;
    private int quant;


    Estoque[] produ = new Estoque[100];
    public void setProduto(int prod) {
        if (prod <= 0){

            throw new IllegalArgumentException("Inválido!!! Digite uma quantidade válida.");

        }
    }


    public void adicionaProdutoLoja(Estoque p){
        boolean adicionado = true;
        if(this.totalProduto<100) {
            for(int i =0; i< this.totalProduto; i++) {
                if(produ[i].equals(p)) {
                    adicionado = false;
                }
            }

            if(adicionado) {
                produ[this.totalProduto]=p;
                this.totalProduto++;
                System.out.println("Produto adicionado!");
            }
            else {
                System.out.println("Produto já foi adicionado!");
            }
        }
        else {
            System.out.println("O estoque atingiu o seu limite!");
        }

    }

    public boolean vendeProduto(int cod, int qnt){
        if (cod == equals(Estoque[]){
            if(qnt<quant){
                quant = quant - qnt;
                
            }
            else{
                System.out.println("Não temos essa quantidade no estoque!!!");
            }

        }

    }

    @Override
    public String toString() {
        return "Estoque{" +
                "cod=" + cod +
                ", produto='" + produto + '\'' +
                ", quant=" + quant +
                '}';
    }

    public void listaProdutosLoja(){
        toString();
    }



}




