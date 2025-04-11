package Week4.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SimpleDatabase {
    private static SimpleDatabase instance;
    private Map<Integer, String> users = new HashMap<>();

    private SimpleDatabase() {
        System.out.println("Database Initialized!");
    }

    public static SimpleDatabase getInstance() {
        if (instance == null) {
            synchronized (SimpleDatabase.class) {
                if (instance == null) {
                    instance = new SimpleDatabase();
                }
            }
        }
        return instance;
    }

    public void addUser(int id, String name) {
        if (users.containsKey(id)) {
            System.out.println("User with ID " + id + " already exists.");
        } else {
            users.put(id, name);
            System.out.println("User added: " + name);
        }
    }




    public void getUser(int id) {
        if (users.containsKey(id)) {
            System.out.println("User ID " + id + ": " + users.get(id));
        } else {
            System.out.println("User not found.");
        }
    }

    public void updateUser(int id, String newName) {
        if (users.containsKey(id)) {
            users.put(id, newName);
            System.out.println("User updated.");
        } else {
            System.out.println("User not found.");
        }
    }
    public void deleteUser(int id) {
        if (users.remove(id) != null) {
            System.out.println("User deleted.");
        } else {
            System.out.println("User not found.");
        }
    }




    public void printAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users in the database.");
        } else {
            System.out.println("All Users:");
            users.forEach((id, name) -> System.out.println("ID: " + id + ", Name: " + name));
        }
    }
}




public class DatabaseSingletonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDatabase db = SimpleDatabase.getInstance();

        while (true) {
            System.out.print("chooose:");
            int choice = sc.nextInt();
            int id;
            String name;

            switch (choice) {
                case 1:
                    System.out.print("enter id");
                    id = sc.nextInt();
                    System.out.print("name:");
                    name = sc.next();
                    db.addUser(id, name);
                    break;
                case 2:
                    System.out.print("id:");
                    id = sc.nextInt();
                    db.getUser(id);
                    break;
                case 3:
                    System.out.print("id:");
                    id = sc.nextInt();
                    System.out.print("name");
                    name = sc.next();
                    db.updateUser(id, name);
                    break;
                case 4:
                    System.out.print("id:");
                    id = sc.nextInt();
                    db.deleteUser(id);
                    break;
                case 5:
                    db.printAllUsers();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
