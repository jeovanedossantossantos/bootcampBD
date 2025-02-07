public class Operadores {
    public static void main(String[] args) throws Exception {

        // Exemplos de operadores lógicos
        boolean igual = 1 == 1;
        boolean diferente = 1 != 1;
        boolean maior = 1 > 1;
        boolean menor = 1 < 1;
        boolean maiorIgual = 1 >= 1;
        boolean menorIgual = 1 <= 1;

        System.out.println("igual: " + igual);
        System.out.println("diferente: " + diferente);
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("maiorIgual: " + maiorIgual);
        System.out.println("menorIgual: " + menorIgual);

        // Exemplos de operadores matemáticos
        int soma = 1 + 1;
        int subtracao = 2 - 1;
        int multiplicacao = 2 * 2;
        int divisao = 4 / 2;
        int modulo = 5 % 2;

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        System.out.println("modulo: " + modulo);

        soma = +1;
        subtracao = -1;

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);

        System.out.println(soma++);
        System.out.println(++soma);

        // Operadores ternarios

        System.out.println(1 == soma ? "É verdade" : "É mentira");

    }
}
