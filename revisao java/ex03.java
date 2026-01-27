import java.util.Scanner; 
public class ex03 {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
       
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
       
        int num2 = ler.nextInt();

       
        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);

    }
}
