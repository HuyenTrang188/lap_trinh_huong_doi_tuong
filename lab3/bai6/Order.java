package lab3.bai6;


public class Order {
    private Product[] p = new Product[100];
    private int n;
    private int count = 0;

    public Order(int n){
        this.n = n;
    }

    public void addProduct(Product product){
        p[count] = product;
        count ++;


    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i<n; i++) {
            total += p[i].getFinalPrice();
        }

        return total;
    }

    public void displayOrder() {
        for (int i = 0; i<n; i++) {
            String type = null;
            if(p[i].getCode() == "F") type = "Food";
            else if(p[i].getCode() == "E") type  = "Electronics";
            System.out.printf("%s - %s - %.2f%n",
                              p[i].getName(),type,
                              p[i].getFinalPrice());
        }

        System.out.printf("Total: %.2f%n", calculateTotal());
    }
}