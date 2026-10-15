package lab3.bai9;

public class PartTimeStaff extends Staff{
    private int workingHours;
    private double hourlyRate;

    public PartTimeStaff(String name, String id, int wh, double hr){
        super(id, name);
        this.hourlyRate = hr;
        this.workingHours = wh;
    }

    @Override 
    public double getPaymentAmount(){
        return this.hourlyRate*this.workingHours;
    }
}
