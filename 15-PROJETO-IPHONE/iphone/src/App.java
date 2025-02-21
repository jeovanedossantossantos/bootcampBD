import java.util.Scanner;

import iphone.Iphone;

public class App {

    public static void main(String[] args) throws Exception {

        String[] musicas = { "Música 1", "Música 2", "Música 3" };
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção:");

            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefonico");
            System.out.println("3 - Navegador Internet");
            System.out.println("4 - Modo de Descanso");
            op = scanner.nextInt();

            switch (op) {
                case 1:

                    if (iphone.getMusicaAtual() != null) {
                        iphone.tocar();
                        System.out.println("Deseja pausar a música?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        int controle = scanner.nextInt();

                        if (controle == 1) {
                            iphone.pausar();
                        }

                    }
                    System.out.println("Nenhuma música selecionada");
                    System.out.println("Selecionen uma das Músicas disponíveis:");
                    System.out.println("Ou digite -1 para voltar ao menu principal");
                    for (int i = 0; i < musicas.length; i++) {
                        System.out.println("Digite " + i + " para reproduzir a musica " + musicas[i]);
                    }

                    int controle = scanner.nextInt();

                    if (controle == -1) {
                        break;
                    }

                    iphone.selecionarMusica(musicas[controle]);
                    iphone.tocar();

                    break;
                case 2:

                    System.out.println("1 - Ligar");
                    System.out.println("2 - Correio de voz");
                    System.out.println("3 - Atender");
                    System.out.println("4 - Desligar");

                    int opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o número para ligar:");
                            String numero = scanner.next();
                            iphone.ligar(numero);
                            break;
                        case 2:
                            iphone.iniciarCorreioVoz();
                            break;
                        case 3:
                            iphone.atender();
                            break;

                        case 4:
                            iphone.desligar();
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("1 - Adicionar nova aba");
                    System.out.println("2 - Atualizar página");
                    System.out.println("3 - Abrir site");
                    System.out.println("4 - Fechar aba");

                    int opcaoNavegador = scanner.nextInt();

                    switch (opcaoNavegador) {
                        case 1:
                            iphone.adicionarNovaAba();
                            break;
                        case 2:
                            iphone.atualizarPagina();
                            break;
                        case 3:
                            System.out.println("Digite o site para abrir:");
                            String site = scanner.next();
                            iphone.exibirPagina(site);
                            break;

                        case 4:
                            iphone.fecharAba();
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (op != 4);
    }
}
