
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int soma = 0;
        int quantidade = 5;

        System.out.println("digite 5 numeros inteiros: ");

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("numero" + i + " : ");
            int numeros = ler.nextInt();
            soma +=numeros;

        }

        double media = (double) soma/quantidade;

        System.out.println("a soma é: " + soma);
        System.out.println("a media é: " + media);
    }
}