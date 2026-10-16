package bai10;
import java.util.ArrayList;
import java.util.List;
class LibrarySection<T extends MediaItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public boolean removeItem(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (T item : items) {
            item.displayInfo();
        }
    }
}
