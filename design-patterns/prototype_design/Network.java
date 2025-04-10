package Week4.prototype_design;

import java.util.ArrayList;
import java.util.List;

public class Network implements Cloneable{

    private String ip;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private String data;

    private List<String> list = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData(){
        try {
            Thread.sleep(3000);
            this.data = "Loading Data over network";
            list.add("ivoyant");
            list.add("systems");
            list.add("intern");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.ip+":"+this.data+":"+this.list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Network network = new Network();
        network.setIp(this.getIp());
        network.setData(this.getData());
        for(String str: this.getList()){
            network.getList().add(str);
        }
        return network;
    }
}
