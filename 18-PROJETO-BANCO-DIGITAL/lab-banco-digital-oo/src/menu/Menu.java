package menu;

import java.util.Scanner;

public class Menu {

    public static int MenuInicial() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Criar conta");
        System.out.println("2 - Entra na conta");

        int op = scanner.nextInt();

        return op;

    }

}
