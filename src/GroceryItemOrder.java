public class GroceryItemOrder{
    private String name;
    private int quantity;
    private double price;

    //public GroceryItemOrder (String name) only setting the name(the default quantity should be one)
    public GroceryItemOrder(String name, int quantity, double price, GroceryList list){
        this.name = name;
        this.quantity = quantity;
        this.price = price;

        list.addItem(this);
    }

    public GroceryItemOrder(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) { this.price = price; }

    public double getPrice() { return price; }

    public double getCost(){ return this.price* this.quantity; }

    public String toString(){
        return this.name + ": " + quantity + "Cost: " + getCost();
    }
}