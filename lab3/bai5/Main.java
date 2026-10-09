package lab3.bai5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new FullTimeEmployee(
            "Nguyen An", "01/01/2000", "NV01",
            15000000, 2000000, 500000
        );

        employees[1] = new PartTimeEmployee(
            "Tran Binh", "15/05/2003", "NV02",
            80, 50000
        );

        employees[2] = new FullTimeEmployee(
            "Le Cuong", "20/08/1999", "NV03",
            18000000, 1000000, 0
        );

        employees[3] = new PartTimeEmployee(
            "Pham Dung", "10/10/2004", "NV04",
            100, 60000
        );

        System.out.println("BANG LUONG NHAN VIEN");
        System.out.printf("%-15s %-15s %15s%n",
                          "Ten", "Loai NV", "Luong thuc nhan");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s %-15s %,15.0f VND%n",
                employees[i].getName(),
                employees[i].getEmployeeType(),
                employees[i].calculateSalary()
            );
        }
    }
}