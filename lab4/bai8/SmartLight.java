package bai8;

public class SmartLight extends Device implements Adjustable {

    public SmartLight(String id, String name) {
        super(id, name);
    }

    @Override
    public void adjustLevel(int level) {
        System.out.println(name + " brightness set to " + level);
    }
}
