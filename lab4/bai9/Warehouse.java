package bai9;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T extends Product> {
    private List<T> items = new ArrayList<>();

    // Nhập kho
    public void importProduct(T product) {
        items.add(product);
    }

    // Xuất kho theo mã hàng
    public boolean exportProduct(String id) {
        return items.removeIf(product ->
            product.getId().equals(id)
        );
    }

    // Kiểm kê
    public void inventory() {
        for (T product : items) {
            System.out.println(product.getInventoryInfo());
        }
    }
}