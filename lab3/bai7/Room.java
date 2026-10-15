package lab3.bai7;

public class Room {
    private int n;
    private int price;
    
    public Room(int n, int price){
        this.n = n;
        this.price = price;
    }
    public int getNum(){
        return this.n;
    }
    public double getPrice(){
        return this.price *n;
    }
    public void display(){
        System.out.println(+this.getPrice());
    }
    
}
