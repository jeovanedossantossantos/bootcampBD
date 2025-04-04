package one.digitalinnovation.gof.singleton;

public class SingletonLayz {

    private static SingletonLayz instance;

    private SingletonLayz() {
        super();
    }

    public static SingletonLayz getInstance() {
        if (instance == null) {
            instance = new SingletonLayz();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

}
