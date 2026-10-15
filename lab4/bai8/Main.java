package bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hub hub = new Hub();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();

            Device device;

            switch (type) {
                case "L":
                    device = new SmartLight(id, name);
                    break;

                case "AC":
                    device = new AirConditioner(id, name);
                    break;

                case "S":
                    device = new SmartSpeaker(id, name);
                    break;

                case "C":
                    device = new AutomaticCurtain(id, name);
                    break;

                default:
                    continue;
            }

            hub.addDevice(device);
        }

        hub.turnOffAll();

        System.out.println();

        hub.setupWifi();

        sc.close();
    }
}
