import com.guilherme.tesch.modelos.Produto;

public class MainProduto {
    public static void main(String[] args){
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3500);

        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());

        produto.aplicaDesconto(10);

        System.out.println("Preço com desconto: R$ " + produto.getPreco());


    }

}
