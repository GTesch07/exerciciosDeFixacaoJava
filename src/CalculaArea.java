/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

import java.util.Scanner;

public class CalculaArea {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU DE OPÇÕES ===\n1 - Calcular área do quadrado \n2 - Calcular área do círculo");
        System.out.print("Escolha uma opção (1 ou 2): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor do lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;

            case 2:
                System.out.println("Digite o valor do raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println(String.format("Área do círculo: %.2f", areaCirculo));
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }
}
