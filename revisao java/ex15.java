public class ex15 {
    protected String nome;

    public void fazerSom() {
        System.out.println("Quáquá");
    }


    public static void main(String[] args) {
       ex15 a = new ex15();
        a.nome = "Pato";
        System.out.println("Nome do animal: " + a.nome);
        a.fazerSom();
    }
}