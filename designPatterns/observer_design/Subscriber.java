package Week4.observer_design;

public class Subscriber implements Observer{

    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println(name+" "+"NOTIFIED!!!");
    }

}
