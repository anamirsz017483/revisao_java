import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número inteiro: "); 
        int numero = ler.nextInt(); 
        int dobro = numero * 2;
        System.out.println("O dobro de " + numero + " é: " + dobro);
      
    }
}
