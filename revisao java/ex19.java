
class Animal {
    protected String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Classe Cachorro
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

// Classe Gato
class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

// Classe principal
public class ex19 {
    public static void main(String[] args) {
        // Polimorfismo: ambos são do tipo Animal
        Animal cachorro = new Cachorro();
        cachorro.nome = "Rex";

        Animal gato = new Gato();
        gato.nome = "Mingau";

        System.out.println("Nome do cachorro: " + cachorro.nome);
        cachorro.fazerSom(); // O cachorro late

        System.out.println("Nome do gato: " + gato.nome);
        gato.fazerSom(); // O gato mia
    }
}