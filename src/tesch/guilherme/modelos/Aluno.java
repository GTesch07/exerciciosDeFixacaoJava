package tesch.guilherme.modelos;

public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double[] getNotas(){
        return notas;
    }

    // Setters para notas (recebe um array de notas)
    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public double calcularMedia(){
        // Se o array for nulo ou vazio, retorna 0.0
        // length percorre o array e retorna a quantidade de elementos que o mesmo possui.
        if (notas == null || notas.length == 0){
            return 0.0;
        }
        double soma = 0.0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
}
