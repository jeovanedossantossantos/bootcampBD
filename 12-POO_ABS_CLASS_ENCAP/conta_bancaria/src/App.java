import java.util.ArrayList;
import java.util.Scanner;

import cliente.Cliente;
import conta.Conta;
import services.Menu;
import utils.BucarConta;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Conta> contas = new ArrayList<Conta>();
        Menu menu = new Menu();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            menu.showMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:

                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o endereço do cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o telefone do cliente: ");
                    String telefone = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf, endereco, telefone);
                    clientes.add(cliente);

                    System.out.println("Digite o saldo inicial da conta: ");

                    double saldo = scanner.nextDouble();
                    Conta conta = new Conta(cliente, saldo);

                    contas.add(conta);

                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Numero da conta: " + conta.getNumeroConta());

                    break;
                case 1:

                    System.out.println("Digite seu cpf: ");
                    String cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    String numeroConta = scanner.nextLine();

                    Conta contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        System.out.println("Saldo: " + contaResponse.getSaldo());
                        System.out.println("Cheque especial: " + contaResponse.getChequeEspecial());
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    break;
                case 2:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();
                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        System.out.println("Cheque especial: " + contaResponse.getChequeEspecial());
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {
                    // System.out.println("Cheque especial: " + c.getChequeEspecial());
                    // break;
                    // }
                    // System.out.println("Conta não encontrada");
                    // }

                    break;

                case 3:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    System.out.println("Digite o valor do deposito: ");
                    double valorDeposito = scanner.nextDouble();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        contaResponse.setTransacao(valorDeposito);
                        System.out.println("Deposito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {
                    // c.setTransacao(valorDeposito);
                    // System.out.println("Deposito realizado com sucesso!");
                    // break;
                    // }
                    // System.out.println("Conta não encontrada");
                    // }

                    break;
                case 4:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        if (contaResponse.getSaldo() >= valorSaque) {
                            contaResponse.setTransacao(-valorSaque);
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {
                    // if (c.getSaldo() >= valorSaque) {
                    // c.setTransacao(-valorSaque);
                    // System.out.println("Saque realizado com sucesso!");
                    // break;
                    // } else {
                    // System.out.println("Saldo insuficiente");
                    // break;
                    // }

                    // }

                    // }
                    // System.out.println("Conta não encontrada");

                    break;
                case 5:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    System.out.println("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        if (contaResponse.getSaldo() >= valorBoleto) {
                            contaResponse.setTransacao(-valorBoleto);
                            System.out.println("Boleto pago com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {
                    // if (c.getSaldo() >= valorBoleto) {
                    // c.setTransacao(-valorBoleto);
                    // System.out.println("Boleto pago com sucesso!");
                    // break;
                    // } else {
                    // System.out.println("Saldo insuficiente");
                    // break;
                    // }

                    // }
                    // System.out.println("Conta não encontrada");
                    // }

                    break;
                case 8:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        if (contaResponse.getUsandoChequeEspecial()) {
                            System.out.println("Conta está usando cheque especial");
                        } else {
                            System.out.println("Conta não está usando cheque especial");
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {
                    // if (c.getUsandoChequeEspecial()) {
                    // System.out.println("Conta está usando cheque especial");
                    // } else {
                    // System.out.println("Conta não está usando cheque especial");
                    // }
                    // break;
                    // }
                    // System.out.println("Conta não encontrada");
                    // }

                    break;
                case 9:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {
                        System.out.println("Valor da taxa do cheque especial: " + contaResponse.getChequeEspecial());
                        System.out.println("Digite 1 para pagar com saldo em conta ou qual numero para cancelar.");
                        int pagar = scanner.nextInt();

                        if (pagar == 1) {
                            contaResponse.pagarTaxaChequeEspecial();
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    // for (Conta c : contas) {
                    // if (c.getNumeroConta().equals(numeroConta) &&
                    // c.getCliente().getCpf().equals(cpf_search)) {

                    // System.out.println("Valor da taxa do cheque especial: " +
                    // c.getChequeEspecial());
                    // System.out.println("Digite 1 para pagar com saldo em conta ou qual numero
                    // para cancelar.");
                    // int pagar = scanner.nextInt();

                    // if (pagar == 1) {
                    // c.pagarTaxaChequeEspecial();

                    // break;
                    // }

                    // break;
                    // }
                    // System.out.println("Conta não encontrada");
                    // }

                    break;

                case 10:

                    System.out.println("Digite seu cpf: ");
                    cpf_search = scanner.nextLine();

                    System.out.println("Digite o numero da conta: ");
                    numeroConta = scanner.nextLine();

                    System.out.println("Digite o valor do saque do cheque especial: ");
                    double valorSaqueChequeEspecial = scanner.nextDouble();

                    contaResponse = BucarConta.buscarConta(contas, numeroConta, cpf_search);

                    if (contaResponse != null) {

                        if (contaResponse.getChequeEspecial() >= valorSaqueChequeEspecial) {
                            contaResponse.setChequeEspecial(-valorSaqueChequeEspecial);
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente");
                        }

                    } else {
                        System.out.println("Conta não encontrada");
                    }

                    break;

                default:
                    break;
            }
        } while (opcao != 11);

    }
}
