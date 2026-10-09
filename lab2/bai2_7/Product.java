package bai2_7;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public void display() {
        System.out.println(id + " - " + name + " - $" + price);
    }
}
