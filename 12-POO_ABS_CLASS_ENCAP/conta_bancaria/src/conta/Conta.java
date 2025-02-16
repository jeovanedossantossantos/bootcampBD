package conta;

import cliente.Cliente;

public class Conta {

    @SuppressWarnings("unused")
    private cliente.Cliente cliente;

    private double saldo = 0;
    private double chequeEspecial = 0;
    private boolean usandoChequeEspecial = false;
    private double taxaChequeEspecial = 0;
    private String numeroConta;

    public Conta(Cliente cliente, double saldo) {

        this.cliente = cliente;
        this.numeroConta = (Math.random() * 9) + cliente.getCpf();

        setTransacao(saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTransacao(double valorTransacao) {
        this.saldo += valorTransacao;
        if (this.saldo <= 500) {
            this.chequeEspecial = 50;
        } else if (this.saldo > 500) {
            this.chequeEspecial = this.saldo * 0.5;
        } else {
            this.chequeEspecial = 0;
        }

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {

        if (this.chequeEspecial >= chequeEspecial) {
            this.chequeEspecial += chequeEspecial;
            setUsandoChequeEspecial(true);
            setTaxaChequeEspecial(chequeEspecial * 0.20);
        } else {
            System.out.println("Valor do cheque especial invalido");
        }

    }

    public boolean getUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    private void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;

    }

    public double getTaxaChequeEspecial() {
        return taxaChequeEspecial;
    }

    private void setTaxaChequeEspecial(double taxaChequeEspecial) {
        this.taxaChequeEspecial += taxaChequeEspecial;
    }

    public void pagarTaxaChequeEspecial() {
        if (this.saldo > this.taxaChequeEspecial) {
            setTransacao(-this.taxaChequeEspecial);
            System.out.println("Taxa paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para pagar a taxa do cheque especial");
        }

    }

    public void pagarBoleto(double valorBoleto) {
        if (this.saldo > valorBoleto) {
            setTransacao(-valorBoleto);
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto");
        }

    }

}
