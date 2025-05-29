public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Titulo da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

    public static void main(String args[]){
        Musica m = new Musica();

        m.titulo = "Believer";
        m.artista = "Imagine Dragons";
        m.anoLancamento = 2017;

        m.exibeFichaTecnica();
        m.avalia(5);
        m.avalia(7);
        m.avalia(8);
        System.out.println("Soma das avaliações: " + m.avaliacao);
        System.out.println("Total de avaliações: " + m.numAvaliacoes);
        System.out.printf(("Média das avaliações: %.2f\n"), m.mediaDasAvaliacoes());

    }
}
