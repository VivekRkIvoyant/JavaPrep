package Week4.prototype_design;

public class Main extends Thread{

    public static void main(String[] args) {

        System.out.println("Prototype Design Pattern");

        Network networkConnection = new Network();
        networkConnection.setIp("111.0023.4358");
        try {
            networkConnection.loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(networkConnection);

        try {
            System.out.println("Data obtained from cloning different network: ");
            Network network2 = (Network) networkConnection.clone();
            System.out.println(network2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
