package lab3.bai7;

public class Standard extends Room {
    public Standard(int n) {
        super(n, 500000);
    }
    @Override 
    public double getPrice(){
        if(this.getNum() > 3) return this.getNum() *0.95 *500000;
        else return this.getNum() *500000;
    }
}
