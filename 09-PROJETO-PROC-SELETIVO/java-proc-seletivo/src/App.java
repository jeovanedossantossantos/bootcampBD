public class App {
    public static void main(String[] args) throws Exception {
        // ProcessoSeletivo.analisarCandidato(2000);
        // ProcessoSeletivo.analisarCandidato(1900);
        // ProcessoSeletivo.analisarCandidato(2200);

        // ProcessoSeletivo.seleciaoCandidatos();
        String[] candidatos = {
                "JOÃO", "MARIA", "LUCAS", "MARCOS", "PEDRO", "PAULO"
        };

        for (String candidato : candidatos) {
            ProcessoSeletivo.entraEmContador(candidato);
        }

    }
}
