import one.digitalinnovation.gof.facade.Facede;
import one.digitalinnovation.gof.singleton.SingletonLayz;
import one.digitalinnovation.gof.startegry.ComportamentoNormal;

public class App {
    public static void main(String[] args) throws Exception {
        // SingletonLayz singleton = SingletonLayz.getInstance();

        // System.out.println(singleton);

        // SingletonLayz singleton2 = SingletonLayz.getInstance();

        // System.out.println(singleton2);
        // System.out.println("Hello, World!");

        // ComportamentoNormal comportamentoNormal = new ComportamentoNormal();

        // comportamentoNormal.mover();

        Facede facede = new Facede();
        facede.migraCliente("Lucas", "12345678");

    }
}
