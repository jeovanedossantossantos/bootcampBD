package exercicios_map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao) {

        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibir() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(this.eventos);
        System.out.println(eventos);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dateSet = this.eventos.keySet();
        // Collection<Evento> values = this.eventos.values();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(this.eventos);

        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {

            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }

    }

}
