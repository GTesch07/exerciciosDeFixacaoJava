import tesch.guilherme.modelos.Livro;

public class MainLivro {
    public static void main(String[] args){
        Livro livro = new Livro();

        livro.setTitulo("Harry Potter: E a Ordem da Fênix");
        livro.setAutor("J.K. Rowling");

        livro.exibiDetalhes();
    }
}
