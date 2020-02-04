public class GroceryItemOrder{
    private String name;
    private int quantity;

    public GroceryItemOrder(String name, int quantity, GroceryList list){
        this.name = name;
        this.quantity = quantity;

        list.addItem(this);
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

    public String toString(){
        return this.name + " : " + quantity;
    }
}