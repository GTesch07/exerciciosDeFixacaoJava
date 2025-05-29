public class Calculadora {
     public int dobrarNumero(int numero){
         return numero * 2;
     }

     public static void main(String args[]){
         Calculadora calc = new Calculadora();
         int resultado = calc.dobrarNumero(5);
         System.out.println("O dobro é: " + resultado);
     }
}
