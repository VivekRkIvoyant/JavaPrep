package Week4.observer_design;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    String channelName;

    private final List<Observer> subscribers = new ArrayList<>();

    public Channel(String name){
        this.channelName = name;
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for(Observer observer: this.subscribers){
            System.out.println("Channel: "+channelName+" "+"added new video");
            observer.notified();
        }
    }
}
