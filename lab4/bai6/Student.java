package bai6;

public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}
