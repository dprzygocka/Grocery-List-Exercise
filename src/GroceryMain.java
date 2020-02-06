public class GroceryMain{

    public static void main(String[] args){
        GroceryList list = new GroceryList();

        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.20, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.20, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.99, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);

        System.out.println("This is the grocery list:");
        list.displayList();
    }
}