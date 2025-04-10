package Week4.singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {
        System.out.println("SingletonBillPugh instance created");
    }

    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}

