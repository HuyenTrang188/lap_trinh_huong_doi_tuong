package bai8;

public class SmartSpeaker extends Device implements WifiConnectable, Adjustable {

    public SmartSpeaker(String id, String name) {
        super(id, name);
    }

    @Override
    public void connectWifi() {
        System.out.println(name + " connected to wifi");
    }

    @Override
    public void adjustLevel(int level) {
        System.out.println(name + " volume set to " + level);
    }
}