package bai8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Robot[] robots = new Robot[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int id = sc.nextInt();
            String modelName = sc.next();

            switch (type) {
                case "DR":
                    robots[i] = new DroneRobot(id, modelName);
                    break;

                case "FR":
                    robots[i] = new FishRobot(id, modelName);
                    break;

                case "AR":
                    robots[i] = new AmphibiousRobot(id, modelName);
                    break;
            }
        }

        for (Robot robot : robots) {
            robot.performMainTask();

            if (robot instanceof Flyable) {
                ((Flyable) robot).fly();
            }

            if (robot instanceof Swimmable) {
                ((Swimmable) robot).swim();
            }

            if (robot instanceof GPS) {
                ((GPS) robot).getCoordinates();
            }

            System.out.println();
        }

        sc.close();
    }
}
