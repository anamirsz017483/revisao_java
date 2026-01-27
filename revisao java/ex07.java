import java.util.Scanner;

public class ex07 {
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("digite um numero inteiro para ver a tabuada: ");

         int numero = ler.nextInt();

         System.out.println("tabuada do " + numero + ":");

         for (int i =1; i <= 10; i ++) {
            int resultado = numero *i;
            System.out.println(numero + " x " + i + " = " + resultado);
         }
    }
}
