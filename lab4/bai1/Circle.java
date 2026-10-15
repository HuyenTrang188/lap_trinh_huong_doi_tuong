package bai1;

public class Circle extends Shape {
    public Circle(int x, int y){
        super(x, y);
    }

    @Override 
    public void draw(){
        System.out.println("Ve hinh tron tai (" +x + " ," +y +")");

    }
    @Override 
    public void erase(){
        System.out.println("xoa hinh tron tai (" + x + ", " + y + ")");
    }
}
