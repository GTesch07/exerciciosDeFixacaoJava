import com.guilherme.tesch.modelos.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Guilherme Tesch");

        //cria e define uma array de notas
        double[] notas = {8.5, 7.0, 9.0, 6.5};

        aluno.setNotas(notas);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média do aluno: " + aluno.calcularMedia());

    }
}
