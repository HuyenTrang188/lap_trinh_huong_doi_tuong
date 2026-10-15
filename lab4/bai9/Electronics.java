package bai9;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String id, String name, int warrantyMonths) {
        super(id, name);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInventoryInfo() {
        return name + " - " + warrantyMonths + " thang bao hanh";
    }
}
