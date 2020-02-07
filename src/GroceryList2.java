import java.util.*;
public class GroceryList2{
    private ArrayList<GroceryItemOrder> list = new ArrayList<GroceryItemOrder>();

    public void addItem(GroceryItemOrder itemOrder){
        if(list.size() < 10) {
            System.out.println("Adding " + itemOrder.getName());
            list.add(itemOrder);
        }else{
            System.out.println("Attempting to add " + itemOrder.getName()+ ", but the list is full");
        }
    }
    public double getTotalCost(){
        double totalCost = 0;
        for (int i =0; i<list.size(); i++){
            totalCost += list.get(i).getPrice() * list.get(i).getQuantity();
        }
        return totalCost;
    }

    public void displayList(){
        for(int i=0; i<list.size(); i++){
            if(list.get(i) != null) {
                System.out.println(list.get(i));
            }
        }
    }

    //public String toString(){ return }

}