import java.util.*;
public class StoreInventoryTester {
    public static void main(String[] args) {
        Inventory storeInventory = new Inventory();
      
        storeInventory.addItem(new Item("pencil", 10, 5.5));
        storeInventory.addItem(new Item("pen", 20, 2.4));
        storeInventory.addItem(new Item("eraser", 12, 5.0));
        storeInventory.addItem(new Item("notebook", 5, 3.2));
        storeInventory.addItem(new Item("journal", 25, 10.5));
        storeInventory.addItem(new Item("pencil case", 10, 7.5));
        storeInventory.addItem(new Item("white out", 21, 2.1));
        storeInventory.addItem(new Item("iPad", 3, 600.7));
        storeInventory.addItem(new Item("headphones", 10, 40.5));
        storeInventory.addItem(new Item("charger", 5, 30.0));
       
    }

        for(int x=0; x<Inventory.size(); x++){

            System.out.println(item);
          
        }
        
        storeInventory.removeItem("pen");
        
        for(int x=0; x<Inventory.size(); x++){
        
            System.out.println(item);
        
        }
        
        storeInventory.updatePrice("notebook", 150);
        
        for(int x=0; x<Inventory.size(); x++){
        
            System.out.println(item);
        
        }
        
        int largestIndex = storeInventory.largestQuantityIndex();
        
        System.out.println(largestIndex);
       
        for(int x=0; x<Inventory.size(); x++){
       
            System.out.println(item);
       
        }
    }