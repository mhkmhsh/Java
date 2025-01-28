public class StoreInventoryTester {
    public static void main(String[] args) {
        Inventory storeInventory = new Inventory();
      
        storeInventory.addItem(new Item("pencil", 10.2, 0));
        storeInventory.addItem(new Item("pen", 20.4, 2));
        storeInventory.addItem(new Item("pen", 20.4, 2));
        storeInventory.addItem(new Item("eraser", 12.5, 5));
        storeInventory.addItem(new Item("notebook", 5.3, 3));
        storeInventory.addItem(new Item("journal", 25, 10));
        storeInventory.addItem(new Item("pencil case", 10.1, 7));
        storeInventory.addItem(new Item("white out", 21.9, 2));
        storeInventory.addItem(new Item("iPad", 600, 6));
        storeInventory.addItem(new Item("headphones", 10.8, 40));
        storeInventory.addItem(new Item("charger", 5.3, 30));
       
    
            System.out.println(storeInventory.getInventoryList());
      
        
        storeInventory.removeItem("pen");
        storeInventory.removeItem();
        System.out.println("");
        System.out.println(storeInventory.getInventoryList());
        
        storeInventory.updatePrice("notebook", 150);
        System.out.println("");
        System.out.println(storeInventory.getInventoryList());;
        System.out.println("");
        int largestIndex = storeInventory.largestQuantityIndex();
        System.out.println("");
        System.out.println("this is the largest index:  " + largestIndex);
        System.out.println("");
        System.out.println(storeInventory.getInventoryList());
    }
}
