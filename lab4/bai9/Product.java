package bai9;

public abstract class Product {
    protected String id;
    protected String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public abstract String getInventoryInfo();
}
