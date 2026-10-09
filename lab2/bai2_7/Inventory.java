package bai2_7;

public class Inventory {
    private Product[] items;

    public Inventory(Product[] items) {
        this.items = items;

    }

    public void displayItems() {
        for (Product product : items) {
            product.display();
        }
    }

    public static void main(String[] args) {

        Product[] arr = new Product[2];

        arr[0] = new Product("Laptop",1000, 1);
        arr[1] = new Product(" Phone", 500, 2);


        Inventory kho = new Inventory(arr);

        arr[0].setPrice(5000);
        kho.displayItems();
    }

}
