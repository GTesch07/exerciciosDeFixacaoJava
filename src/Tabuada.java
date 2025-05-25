/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
*/

import java.util.Scanner;

public class Tabuada {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TABUADA ===");
        System.out.print("Digite um número: ");
        int opcao = scanner.nextInt();

        System.out.println("Tabuada do " + opcao + ":");
        for (int i = 1; i <= 10; i++){
            int resultado = opcao * i;
            System.out.println(opcao + " x " + i + " = " + resultado);
        }

    }
}
