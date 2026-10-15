
package lab3.bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        IPayable[] payableList = new IPayable[n];

        // Nhap du lieu
        for (int i = 0; i < n; i++) {
            String code = sc.next();

            if (code.equals("S")) {
                String id = sc.next();
                String name = sc.next();
                int workingHours = sc.nextInt();
                double hourlyRate = sc.nextDouble();

                payableList[i] = new PartTimeStaff(
                    id, name, workingHours, hourlyRate
                );

            } else if (code.equals("I")) {
                String itemName = sc.next();
                int quantity = sc.nextInt();
                double pricePerItem = sc.nextDouble();

                payableList[i] = new Invoice(
                    itemName, quantity, pricePerItem
                );
            }
        }

        // Tinh tong tien
        double total = 0;

        for (IPayable payable : payableList) {
            if (payable instanceof PartTimeStaff) {
                PartTimeStaff staff = (PartTimeStaff) payable;

                System.out.println(
                    "PartTimeStaff " + staff.getName()
                    + " - Payment: " + payable.getPaymentAmount()
                );

            } else if (payable instanceof Invoice) {
                Invoice invoice = (Invoice) payable;

                System.out.println(
                    "Invoice " + invoice.getItemName()
                    + " - Payment: " + payable.getPaymentAmount()
                );
            }

            total += payable.getPaymentAmount();
        }

        System.out.println("Total Payment = " + total);

        sc.close();
    }
}
