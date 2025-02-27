package exercicios_set.OperacaoBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String name, String codigo) {
        Convidado convidado = new Convidado(name, codigo);
        this.convidados.add(convidado);
    }

    public void exibirConvidados() {
        for (Convidado convidado : this.convidados) {
            System.out.println(convidado);
        }
    }

    public void removerConvidado(String codigo) {
        Convidado convidado = null;
        for (Convidado convidadoAtual : this.convidados) {
            if (convidadoAtual.getCodigo() == codigo) {
                convidado = convidadoAtual;
                break;
            }
        }
        this.convidados.remove(convidado);
    }

}
