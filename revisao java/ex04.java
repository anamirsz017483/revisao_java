import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
       System.out.println("digite um numero inteiro: ");
       int numero = ler.nextInt();

       if (numero > 0) {
        System.out.print("o numero é positivo.");
       } else if (numero < 0) {
        System.out.println("o numero é negativo.");
       } else   {
           System.out.println("o numero é zero.");
       }
    }
}