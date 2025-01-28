public class Item{
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;   
    }

    public double getPrice() {
        return price;
    }

    public void updateQuantity(int x){
        quantity = x;
    }

    public void setPrice(double a){
        price = a;
    }

    public String toString(){
        return "Name: " + name + " Quantity: " + quantity + " Price: " + price + "\n";
    }
}
