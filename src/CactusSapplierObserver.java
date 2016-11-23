import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by jlaba on 21.11.2016.
 */
public class CactusSapplierObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int count = 0;
        LinkedList<Item> bouquet = (LinkedList)arg;
        for(int i = 0; i < ((LinkedList) arg).size(); i++){
            System.out.println(i);
            int x = bouquet.get(i).searchFlower("Cactus");
            count += x;

        }System.out.println("You will be delivered " + count + " cactuses");
    }
}






