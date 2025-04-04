package one.digitalinnovation.gof.singleton;

public class SingletonEarger {

    private static final SingletonEarger instance = new SingletonEarger();

    private SingletonEarger() {
        super();
    }

    public static SingletonEarger getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
