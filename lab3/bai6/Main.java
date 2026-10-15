
package lab3.bai6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Order order = new Order(n);

        for (int i = 0; i < n; i++) {
            String code = sc.next();

            String name = sc.next();
            name = name.substring(1, name.length() - 1);

            double basePrice = sc.nextDouble();

            if (code.equals("E")) {
                double warrantyFee = sc.nextDouble();

                Product p = new Electronics(
                    name, basePrice, warrantyFee
                );

                order.addProduct(p);

            } else if (code.equals("F")) {
                String date = sc.next();
                LocalDate expiryDate = LocalDate.parse(date);

                Product p = new Food(
                    name, basePrice, expiryDate
                );

                order.addProduct(p);
            }
        }

        order.displayOrder();

        sc.close();
    }
}