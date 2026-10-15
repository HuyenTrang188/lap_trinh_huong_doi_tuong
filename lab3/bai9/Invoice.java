package lab3.bai9;

public class Invoice implements IPayable {
    private String itemName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String itemName, int quantity, double  pr){
        this.itemName = itemName;
        this.pricePerItem = pr;
        this.quantity = quantity;

    }

    public String getItemName(){
        return this.itemName;
    }
    @Override 
    public double getPaymentAmount(){
        return this.quantity *this.pricePerItem;
    }
}
