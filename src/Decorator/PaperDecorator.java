package Decorator;

import Decorator.Item;
import Decorator.ItemDecorator;

/**
 * Created by jlaba on 13.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    /**
     * This is one of the decorators types, which change behaviour during runtime
     */

    public PaperDecorator(Item item) {
        super(item);
    }
    public String getDescription() {
        return item.getDescription() + ", Paper";
    }
    public double cost() {
        return 13 + item.cost();
    }



}
