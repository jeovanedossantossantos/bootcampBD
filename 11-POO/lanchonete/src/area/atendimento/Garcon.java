package area.atendimento;

import area.atendimento.cozinha.Cozinheiro;

public class Garcon {
    public void anotarPedido() {
        System.out.println("O garçom está anotando o pedido.");
        Cozinheiro cozinheiro = new Cozinheiro();

        cozinheiro.servirPrato();
    }

    public void entregarPedido() {
        System.out.println("O garçom está entregando o pedido.");
    }

    public void servir() {
        System.out.println("O garçom está servindo.");
    }

    public void limparMesa() {
        System.out.println("O garçom está limpando a mesa.");
    }
}
