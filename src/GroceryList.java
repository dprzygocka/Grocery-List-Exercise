public class GroceryList{
    private GroceryItemOrder[] list = new GroceryItemOrder[10];

    public void addItem(GroceryItemOrder itemOrder){
        if(list[9] == null) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == null) {
                    System.out.println("Adding " + itemOrder.getName());
                    list[i] = itemOrder;
                    break;
                }
            }
        }else{
            System.out.println("Attempting to add " + itemOrder.getName()+ ", but the list is full");
        }
    }

    public void displayList(){
        for(int i=0; i<list.length; i++){
            if(list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }

}