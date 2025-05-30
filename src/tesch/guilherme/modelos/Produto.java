package tesch.guilherme.modelos;

public class Produto {

    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }else {
            System.out.println("Preço inválido.");
        }
    }

    public void aplicaDesconto(double percentual){
        if (percentual > 0 && percentual <= 100){
            double desconto = preco * (percentual/100);
            preco -= desconto;
        }else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

}
