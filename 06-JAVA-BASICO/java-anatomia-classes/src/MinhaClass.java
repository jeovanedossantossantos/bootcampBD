public class MinhaClass {

    public static void main(String[] args) {

        int ano = 2025;
        ano += 1;

        final String BR = "Brazil";

        boolean response = 1 == 2;

        int res = somar(1, 2);
        String nome = nomeCompleto("Jeovane dos", "Santos");

        System.out.println(BR);
        System.out.println(ano);
        System.out.println(response);

        System.out.println(res);
        System.out.println(nome);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static String nomeCompleto(String a, String b) {
        return a.concat(" ").concat(b);
    }

}
