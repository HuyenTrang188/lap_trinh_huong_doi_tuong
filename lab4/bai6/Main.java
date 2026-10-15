package bai6;

public class Main {
    public static void main(){
        Integer[] number = {5, 1, 3, 2};
        ArrayUtils.sort(number);
        for(Integer i : number){
            System.out.print(i + " ");
        }
        System.out.println();

        String[] code =  {"Java", "C++", "Python"};
        ArrayUtils.sort(code);

        for(String s :code){
            System.out.print(s + " ");
        }
        System.out.println();
        
         Student[] students = {
            new Student("An", 8.5),
            new Student("Binh", 7.0),
            new Student("Chi", 9.0)
        };

        ArrayUtils.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
