package bai8;

public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;

    public Robot(int id, String modelName){
        this.id = id;
        this.modelName = modelName;
    }

    public void chanrgeBattery(){
        this.batteryLevel = 100;
    }

    public final void showIdentity(){
        System.out.println("ID: " +this.id);
        System.out.println("mode: " +this.modelName);

    }

    public String getModelName() {
        return modelName;
    }

    abstract void performMainTask();

}
