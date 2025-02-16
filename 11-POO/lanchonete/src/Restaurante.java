import area.atendimento.Garcon;
import area.cliente.Cliente;

public class Restaurante {
    public static void main(String[] args) {

        Garcon garcon = new Garcon();
        Cliente cliente = new Cliente();

        garcon.anotarPedido();
        garcon.entregarPedido();
        cliente.comer();
        cliente.pagar();
        garcon.limparMesa();
        cliente.reclamar();
    }
}
