import banco.Banco;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		// Criando o banco
		Banco banco = new Banco("Meu Banco");

		// Criando clientes
		Cliente cliente1 = new Cliente("João");
		Cliente cliente2 = new Cliente("Maria");

		// Criando contas
		ContaCorrente contaCorrenteJoao = new ContaCorrente(cliente1);
		ContaPoupanca contaPoupancaMaria = new ContaPoupanca(cliente2);

		// Adicionando as contas ao banco
		banco.getContas().add(contaCorrenteJoao);
		banco.getContas().add(contaPoupancaMaria);

		// Realizando operações bancárias
		contaCorrenteJoao.depositar(1000);
		contaCorrenteJoao.sacar(200);
		contaCorrenteJoao.transferir(300, contaPoupancaMaria);

		// Exibindo extratos
		contaCorrenteJoao.imprimirExtrato();
		contaPoupancaMaria.imprimirExtrato();

		System.out.println(banco.getContas());
	}
}