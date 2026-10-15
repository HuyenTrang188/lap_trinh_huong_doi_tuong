package bai8;

public class FishRobot extends Robot implements Swimmable{

    public FishRobot(int id, String modeleName){
        super(id, modeleName);
    }
    
    @Override 
    public void performMainTask(){
        System.out.println(this.getModelName() + " performing main task");
    }

    @Override 
    public void swim(){
        System.out.println(this.getModelName() + " Swimming");
    }
}
