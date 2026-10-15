package bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Warehouse<Food> foodWarehouse = new Warehouse<>();
        Warehouse<Electronics> electronicsWarehouse = new Warehouse<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();

            if (type.equals("F")) {
                String expiryDate = sc.next();
                Food food = new Food(id, name, expiryDate);
                foodWarehouse.importProduct(food);
            } else if (type.equals("E")) {
                int warrantyMonths = sc.nextInt();
                Electronics electronics =
                    new Electronics(id, name, warrantyMonths);

                electronicsWarehouse.importProduct(electronics);
            }
        }

        System.out.println("Kho thuc pham:");
        foodWarehouse.inventory();

        System.out.println();

        System.out.println("Kho dien tu:");
        electronicsWarehouse.inventory();

        sc.close();
    }
}