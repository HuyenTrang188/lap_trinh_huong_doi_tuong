package bai2_4;

public class Employee {
    private String name;
    private MyDate birthDate;

    public Employee(String name, MyDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthDate = new MyDate(other.birthDate.getDay(), other.birthDate.getMonth(), other.birthDate.getYear());
    }

    public static void main(String[] args) {
       Employee e1 = new Employee("cyne", new MyDate(1, 1, 2000));
       Employee e2 = new Employee(e1);

       e1.birthDate.setDay(2);
       e1.birthDate.setMonth(2);
       e1.birthDate.setYear(2022);


        System.out.println("Thong tin nhan vien e1:");
        System.out.println("Ten: " + e1.name);
        e1.birthDate.getDate();

        System.out.println("\nThong tin nhan vien e2:");
        System.out.println("Ten: " + e2.name);
        e2.birthDate.getDate();
    }

}

