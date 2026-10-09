package bai2_2;

public class Student {
    
    private String name;
    private String Id;
    private float gpa;
    private String email;

    public Student() {
    }

    public Student(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
    public Student(String name, String Id, float gpa, String email) {
        this.name = name;
        this.Id = Id;
        this.gpa = gpa;
        this.email = email;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("name khong hop le");
        } else this.name = name;
    }

    public void setId(String Id) {
        if (Id == null || Id.isEmpty()) {
            System.out.println("Id khong hop le");
        } else this.Id = Id;
    }

    public void setGpa(float gpa) {
        if (gpa < 0 || gpa > 4) {
            System.out.println("gpa khong hop le");
        } else this.gpa = gpa;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("email khong hop le");
        } else this.email = email;
    }

    public void getStudent() {
        System.out.println("name: " + name);
        System.out.println("Id: " + Id);
        System.out.println("gpa: " + gpa);
        System.out.println("email: " + email);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van", "123456");
        Student student2 = new Student();
        Student student3 = new Student("cyne", "654321", 3.5f, "cyne@gmail.com");

        student1.setGpa(3.8f);
        student2.setName("");
        student3.setGpa(5f);
        student3.setGpa(-2f);
        student1.getStudent();
        student2.getStudent();
        student3.getStudent();
    }
}


