package lab3.bai5;

public abstract class Employee {
    protected String name;
    protected String dateOfBirth;
    protected String employeeId;

    public Employee(String name, String dateOfBirth, String employeeId) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public abstract String getEmployeeType();

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}