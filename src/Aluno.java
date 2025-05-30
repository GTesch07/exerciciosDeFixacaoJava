public class Aluno {
    String nome;
    int idade;
    int matricula;
    String serie;
    String sala;
    String turno;


    void exibeInformacoes(){
        System.out.println("Nome do aluno: "+ nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Série: "+ serie);
        System.out.println("Sala: "+ sala);
        System.out.println("Turno: "+ turno);
        
    }

    public static void main(String args[]){
        Aluno aluno = new Aluno();
        aluno.nome = "Guilherme";
        aluno.idade = 21;
        aluno.matricula = 26154;
        aluno.serie = "3º ano";
        aluno.sala = "301 A";
        aluno.turno = "Manhã";

        aluno.exibeInformacoes();
    }
}
