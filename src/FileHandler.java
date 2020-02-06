import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler{

    public void loadData(String fileName, GroceryList2 list){
        Scanner scan = null;
        try {
            scan = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNext()){
            String line = scan.nextLine();
            Scanner lineScan = new Scanner(line);
            list.addItem(new GroceryItemOrder( lineScan.next(), lineScan.nextInt(), lineScan.nextDouble()));
            //should I write while lineScan.hasNext ect?)
        }
    }
}