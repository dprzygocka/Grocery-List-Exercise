public class GroceryMain{

    public static void main(String[] args){
        GroceryList list = new GroceryList();
        GroceryList2 list2 = new GroceryList2();

        FileHandler fh = new FileHandler();

        fh.loadData("groceries.txt", list2);

      /*  new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.20, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.20, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("beer", 6, 20, list);
        new GroceryItemOrder("spinach", 1, 15.99, list);
        new GroceryItemOrder("cheese", 2, 23.99, list);
        new GroceryItemOrder("spinach", 1, 15.20, list);*/

        System.out.println("This is the grocery list:");
        list2.displayList();
    }
}