import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextInt());
        System.out.println("Digite a agência:");
        conta.setAgencia(scanner.next());
        System.out.println("Digite o nome do cliente:");
        conta.setNomeCliente(scanner.next());
        System.out.println("Digite o saldo:");
        conta.setSaldo(scanner.nextDouble());

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        // ou com o concat

        String menssagem = "Olá ".concat(conta.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(conta.getAgencia())
                .concat(", conta") + " " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                + " já está disponível para saque.";

        System.out.println(menssagem);
    }
}
