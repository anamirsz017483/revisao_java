class Animal {
    protected String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

public class ex16 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.nome = "Rex";

        System.out.println("Nome do cachorro: " + c.nome);
        c.fazerSom(); 
    }
}