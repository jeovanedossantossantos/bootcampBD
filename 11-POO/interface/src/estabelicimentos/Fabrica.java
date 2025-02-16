package estabelicimentos;

import equipamento.multfuncional.MultiFuncao;

public class Fabrica {

    public static void main(String[] args) {

        MultiFuncao multiFuncao = new MultiFuncao();

        multiFuncao.imprimir();
        multiFuncao.copiar();
        multiFuncao.digitalizar();
    }

}
