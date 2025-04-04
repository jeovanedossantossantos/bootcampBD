package one.digitalinnovation;

public class CrmService {

    private CrmService() {
        super();
    }

    public void saveClient(String nome, String cep) {
        // salvar cliente
        System.out.println("Cliente " + nome + " com cep " + cep + " salvo com sucesso!");
    }
}