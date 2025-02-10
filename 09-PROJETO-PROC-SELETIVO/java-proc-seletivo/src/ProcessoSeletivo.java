import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static void entraEmContador(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {

                System.out.println("CONTADO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTADO COM " + candidato + " NA " + tentativasRealizadas);

        } else {
            System.out.println("Não conseguimos contado");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionado() {
        String[] candidatos = {
                "JOÃO", "MARIA", "LUCAS", "MARCOS", "PEDRO", "PAULO"
        };

        System.out.println("Lista de candidatos");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é o " + candidatos[i]);
        }
    }

    static void seleciaoCandidatos() {
        String[] candidatos = {
                "JOÃO", "MARIA", "LUCAS", "MARCOS", "PEDRO", "PAULO"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 3 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.err.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.err.println("AGURDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        } else {
            System.err.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
