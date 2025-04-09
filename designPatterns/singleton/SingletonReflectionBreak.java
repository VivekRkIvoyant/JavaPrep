package Week4.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflectionBreak {
    public static void main(String[] args) {
        try {
            SingletonBillPugh instanceOne = SingletonBillPugh.getInstance();
            Constructor<?> constructor = SingletonBillPugh.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonBillPugh instanceTwo = (SingletonBillPugh) constructor.newInstance();

            System.out.println("Instance 1: " + instanceOne.hashCode());
            System.out.println("Instance 2 (via reflection): " + instanceTwo.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
