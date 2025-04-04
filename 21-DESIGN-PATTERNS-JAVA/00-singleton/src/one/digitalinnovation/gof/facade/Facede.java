package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.CepService;

public class Facede {
    public void migraCliente(String nome, String cep) {

        String cidade = CepService.getInstance().recuperarCidade(cep);
        // migrar cliente
        System.out
                .println("Cliente " + nome + " com cep " + cep + " migrado com sucesso!" + " para a cidade " + cidade);
    }

}
