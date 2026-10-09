package lab3.bai5;

public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, String dateOfBirth,
                            String employeeId, double workingHours,
                            double hourlyRate) {
        super(name, dateOfBirth, employeeId);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public String getEmployeeType() {
        return "Part-time";
    }
}