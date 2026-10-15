package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();

            if (type.equals("O")) {
                employees[i] = new OfficeWorker(id, name, baseSalary);
            } else if (type.equals("T")) {
                int overtimeHours = sc.nextInt();
                employees[i] = new Technician(id, name, baseSalary, overtimeHours);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - Pay: " + employee.calculatePay());
            employee.work();
            System.out.println();
        }

        sc.close();
    }
}