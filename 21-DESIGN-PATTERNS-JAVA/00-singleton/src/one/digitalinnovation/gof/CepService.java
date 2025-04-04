package one.digitalinnovation.gof;

public class CepService {

    private static CepService instance = new CepService();

    private CepService() {
        super();
    }

    public static CepService getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
