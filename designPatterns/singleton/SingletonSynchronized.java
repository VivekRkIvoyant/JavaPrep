package Week4.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
        System.out.println("synchronized instance created");
    }

    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
