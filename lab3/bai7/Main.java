package lab3.bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int n = sc.nextInt();

        Room room;

        if (type.equals("S")) {
            room = new Standard(n);
        } else if (type.equals("V")) {
            room = new Vip(n);
        } else {
            System.out.println("Loai phong khong hop le!");
            sc.close();
            return;
        }

        room.display();
        sc.close();
    }
}