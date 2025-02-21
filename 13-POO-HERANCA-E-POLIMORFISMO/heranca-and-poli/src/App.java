public class App {
    public static void main(String[] args) throws Exception {
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuAnimal.fazerSom(); // Saída: O animal faz um som
        meuCachorro.fazerSom(); // Saída: O cachorro late
        meuGato.fazerSom(); // Saída: O gato mia
    }
}
