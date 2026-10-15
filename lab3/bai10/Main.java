package lab3.bai10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Employee[] ArrayList = new Employee[n];
        
        for(int i = 0; i< n; i++){
            String code = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            if(code.equals("D")){
                int overtimeHours = sc.nextInt();
                ArrayList[i] = new Developer(name, baseSalary, overtimeHours);
            }
            else if(code.equals("T")){
                int bugsFound = sc.nextInt();
                ArrayList[i] = new Tester(name, baseSalary, bugsFound);
            }
            else ArrayList[i] = new Employee(name, baseSalary);
        }

        for(Employee e : ArrayList){
            if(e instanceof Developer){
                Developer dev = (Developer) e;
                System.out.println(dev.getName() + "-Bonus: " + dev.calculateBonus());
                System.out.println("Tang khoa hoc AWS");
                System.out.println();
            }

            else if( e instanceof Tester){
                Tester t = (Tester) e;
                System.out.println(t.getName() + "-Bonus: " + t.calculateBonus());
                System.out.println("Tang tool test");
                System.out.println();

            }
            else{
                System.out.println(e.getName()+ "-Bonus: " + e.calculateBonus() );
                System.out.println();
            }
        }
    }
}
