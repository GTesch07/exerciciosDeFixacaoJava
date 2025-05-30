public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade (int anoAtual){
        return anoAtual - ano;
    }

    public static void main(String args[]){
        Carro c = new Carro();

        c.modelo = "Civic";
        c.ano = 2008;
        c.cor = "Preto";

        c.exibeFichaTecnica();

        System.out.println("Idade do carro: " + c.calculaIdade(2025) + " Anos");
    }
}
