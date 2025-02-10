public class ResultadoEscola {
    public static void main(String[] args) {

        int nota = 8;

        if (nota < 6) {
            System.out.println("Reprovado");
        } else if (nota == 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

    }
}
