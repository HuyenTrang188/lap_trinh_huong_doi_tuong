package lab3.bai6;
public class Product {
    protected String code;
    protected String name;
    protected double basePrice;

    public Product(String code, String name, double basePrice) {
        this.code = code;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getCode(){
        return code;
    }
    
    public double getFinalPrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }
}