import tesch.guilherme.modelos.IdadePessoa;

public class MainIdadePessoa {
    public static void main(String args[]){
        IdadePessoa info = new IdadePessoa();

        info.setNome("Guilherme da Silva Tesch");
        info.setIdade(21);

        info.verificarIdade();
    }
}
