package Decorator;

import Decorator.Item;
import Decorator.ItemDecorator;

/**
 * Created by jlaba on 14.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {
    /**
     * This is one of the decorators types, which change behaviour during runtime
     */

    public RibbonDecorator(Item item)
    {
        super(item);
    }

    public String getDescription() {
        return item.getDescription() + ", Ribbon";
    }
    public double cost() {
        return 4 + this.item.cost();
   }


}
