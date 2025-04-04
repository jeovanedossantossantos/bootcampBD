package one.digitalinnovation.gof.singleton;

class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}