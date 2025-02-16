public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno("João", 20, "Engenharia de Software", "MAT" + (int) (Math.random() * 1000));
        System.out.println(aluno.getCurso());
        aluno.setCurso("Pisicologia");
        System.out.println(aluno.getCurso());
        System.out.println(aluno.getMatricula());

        for (EnumEstados estado : EnumEstados.values()) {
            System.out.println(estado.getNome() + " - " + estado.getSigla());
        }

        EnumEstados estado = EnumEstados.AC;
        System.out.println(estado.getNome() + " - " + estado.getSigla());

    }
}
