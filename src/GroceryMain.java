public class GroceryMain{

    public static void main(String args[]){
        GroceryList list = new GroceryList();

        new GroceryItemOrder("cheese", 2, list);
        new GroceryItemOrder("beer", 6, list);
        new GroceryItemOrder("spinach", 1, list);
        new GroceryItemOrder("cheese", 2, list);
        new GroceryItemOrder("beer", 6, list);
        new GroceryItemOrder("spinach", 1, list);
        new GroceryItemOrder("cheese", 2, list);
        new GroceryItemOrder("beer", 6, list);
        new GroceryItemOrder("spinach", 1, list);
        new GroceryItemOrder("cheese", 2, list);
        new GroceryItemOrder("beer", 6, list);
        new GroceryItemOrder("spinach", 1, list);

        System.out.println("This is the grocery list:");
        list.displayList();
    }
}