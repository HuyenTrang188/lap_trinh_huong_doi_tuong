package lab3.bai10;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.baseSalary = baseSalary;
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }
    public double calculateBonus(){
        return this.baseSalary *0.1;
    }


}
