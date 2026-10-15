package lab3.bai6;

public class Electronics extends Product {
    private double warrantyFee;

    public Electronics(String name, double basePrice,
                       double warrantyFee) {
        super("E", name, basePrice);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double getFinalPrice() {
        return basePrice * 1.1 + warrantyFee;
    }
}
