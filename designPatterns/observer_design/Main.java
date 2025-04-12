package Week4.observer_design;

public class Main {

    public static void main(String[] args) {

        Channel channel1 = new Channel("freeCodeCamp");
        Subscriber vivek = new Subscriber("vivek");
        channel1.subscribe(vivek);
        channel1.notifyChanges();

        Channel channel2 = new Channel("engineeringDigest");
        Subscriber virat = new Subscriber("virat");
        channel2.subscribe(virat);
        channel2.notifyChanges();

        Channel channel3 = new Channel("CodeWithHarry");
        channel3.subscribe(vivek);
        channel3.notifyChanges();

        channel1.subscribe(virat);
        channel1.notifyChanges();

        System.out.println("Changes after Unsubscribing: ");
        channel1.unsubscribe(virat);
        channel1.notifyChanges();

    }
}
