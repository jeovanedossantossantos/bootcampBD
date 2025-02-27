package exercicios_list.OperacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String description) {
        this.tarefas.add(new Tarefa(description));
    }

    public void removerTarefa(String description) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(description)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        this.tarefas.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTarefa() {
        return this.tarefas.size();
    }

    public void exibirTarefas() {

        System.out.println(this.tarefas);

    }

}
