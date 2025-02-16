package utils;

import java.util.ArrayList;

import conta.Conta;

public class BucarConta {

    public static Conta buscarConta(ArrayList<Conta> contas, String numeroConta, String cpf_search) {
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numeroConta) && c.getCliente().getCpf().equals(cpf_search)) {
                return c;
            }
        }
        return null;
    }

}
