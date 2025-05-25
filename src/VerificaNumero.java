import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo ou negativo: ");

        if (scanner.hasNextDouble()) {
            double numero = scanner.nextDouble();

            if (numero >= 0) {
                System.out.println("Número positivo!");
            } else {
                System.out.println("Número negativo!");
            }
        } else {
            System.out.println("Resposta incorreta.");
        }
        scanner.close();
    }
}

/*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/