package Observer;

import Decorator.Item;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by jlaba on 22.11.2016.
 */
public class RomashkaSapplierObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int count = 0;
        List<Item> bouquet = (List)arg;
        for(int i = 0; i < ((List) arg).size(); i++){
            int x = bouquet.get(i).searchFlower("Romashka");
            count+=x;

        }System.out.println("You will be delivered " + count + " romashkas");
    }
}

