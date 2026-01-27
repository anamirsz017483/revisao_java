import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite a idade da pessoa:");  
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("essa pessoa é maior de idade.");
        } else {
            System.out.println("essa pessoa é menor de idade.");
        }

    
    
    
    
    }
}