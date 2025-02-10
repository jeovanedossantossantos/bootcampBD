public class Excecao {
    public static void main(String[] args) throws Exception {

        try {
            int valor = 1 / 0;

            System.out.println("Hello, World! " + valor);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não pode ser feita!");

        } catch (Exception e) {
            System.out.println("Erro não previsto!");

        }

    }
}
