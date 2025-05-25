import java.util.Scanner;

/*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
*/

public class ComparaNumero {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Digite dois números inteiros - ");
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais!");
        }
        else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        }else if (numero1 < numero2){
            System.out.println("O segundo número é maior.");
        } if (numero1 != numero2){
            System.out.println("Os números são diferentes!");
        }
        scanner.close();
    }
}
