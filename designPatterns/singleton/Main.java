package Week4.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main extends Thread{

    public void run(){
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println(connection.hashCode());
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

//        DatabaseConnection db = new DatabaseConnection();
//        Cannot create multiple objects as the constructor is private

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println(db1.hashCode());

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2.hashCode());

        Thread t1 = new Thread(new Main());
        t1.start();
        try {
            System.out.println(Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        Thread t2 = new Thread( new Main());
        t2.start();

        Thread t3 = new Thread(new Main());
        t3.start();

        Thread t4 = new Thread(new Main());
        t4.start();

        Constructor<DatabaseConnection> constructor = DatabaseConnection.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DatabaseConnection databaseConnection = constructor.newInstance();
        System.out.println(databaseConnection.hashCode());


//        Serilization and Deserilization Approach
        DatabaseConnection con = DatabaseConnection.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("home.ob"));
        outputStream.writeObject(con);

        System.out.println("serilization done...");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("home.ob"));
        DatabaseConnection d2 = (DatabaseConnection) inputStream.readObject();
        System.out.println(d2.hashCode());
    }
}

