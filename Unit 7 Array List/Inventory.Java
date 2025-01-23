import java.util.*;
public class Inventory{
    private ArrayList<Item> inStock;

    public Inventory() {
        inStock = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        inStock.add(item);
    }

  
    public void removeItem(String name) {
        for (int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getName().equals(name)) {
                inStock.remove(i);
                i--; 
            }
        }
    }
    public void removeItem() {
        for (int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getQuantity() == 0) {
                inStock.remove(i);
                i--;
            }
        }
    }
 
    public void updatePrice(String name, double percentChange) {
        for (int i = 0; i < inStock.size(); i++) {
            Item item = inStock.get(i);
            if (item.getName().equals(name)) {
                double newPrice = item.getPrice() * (1 + percentChange / 100);
                item.setPrice(newPrice);
            }
        }
    }

    public int largestQuantityIndex() {
        int largestIndex = -1;
        int largestQuantity = -1;
        for (int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getQuantity() > largestQuantity) {
                largestQuantity = inStock.get(i).getQuantity();
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public ArrayList<Item> getInventoryList() {
        return inStock;
    }
}
