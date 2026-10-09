package lab3.bai2;

public class bai4 {
     public static void main(String[] args) {
        Animal a = new Dog();

        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.makeSound();
        } else {
            System.out.println("day khong phai meo");
        }

       // Cat d = (Cat) a;
       // d.makeSound();
    }
}
