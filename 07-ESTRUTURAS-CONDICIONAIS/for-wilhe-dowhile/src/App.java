public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {
            System.out.println("For > Número: " + i);
        }

        int i = 0;

        while (i < 10) {

            System.out.println("While > Número: " + i);
            i++;

        }

        i = 0;

        do {
            System.out.println("Do While > Número: " + i);
            i++;
        } while (i < 10);

        String alunos[] = { "João", "Vitor", "Maria" };
        for (i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);

        }

    }
}
