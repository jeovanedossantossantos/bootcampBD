package equipamento.multfuncional;

import equipamento.copiadora.Copiadora;
import equipamento.digitalizadora.Digitalizadora;
import equipamento.impressora.Impressora;

public class MultiFuncao implements Digitalizadora, Impressora, Copiadora {

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando...");
    }

}
