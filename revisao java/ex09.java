import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);

      System.out.print("digite um numero inteiro: ");
       int numero = ler.nextInt();

       if (numero % 2 == 0) {
        System.out.println("o numero" + numero + "é par.");
       } else {
        System.out.println("o  numero" + numero + "é impar.");
       }
    }
}
