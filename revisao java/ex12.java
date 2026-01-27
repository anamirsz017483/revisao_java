public class ex12 {

    String nome;
    int idade;
    String apresentacao;

    void mostrarDados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(apresentacao);
    }

    public static void main(String[] args) {
        ex12 p1 = new ex12();

        p1.nome = "Gabriel";
        p1.idade = 16;
        p1.apresentacao = "Olá sou aluno da escola SENAI. ";

        p1.mostrarDados();
    }
}