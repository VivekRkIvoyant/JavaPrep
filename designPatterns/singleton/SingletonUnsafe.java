package Week4.singleton;

public class SingletonUnsafe {
    private static SingletonUnsafe instance;

    private SingletonUnsafe() {
        System.out.println("SingletonUnsafe instance created");
    }

    public static SingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonUnsafe();
        }
        return instance;
    }
}

