public class ex14 {
    
    private String nome;
    private int idade;

    
    public ex14(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

   
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");
    }


    public static void main(String[] args) {
        ex14 p1 = new ex14("João Silva", 30);
        p1.apresentar();
    }
}

