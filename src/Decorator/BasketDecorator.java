package Decorator;

/**
 * Created by jlaba on 14.11.2016.
 */
public class BasketDecorator extends ItemDecorator {
    /**
     * This is one of the decorators types, which change behaviour during runtime
    */

    public BasketDecorator(Item item)
    {
        super(item);
    }
    public String getDescription()
    {
        return item.getDescription() + ", Basket";
    }
    public double cost()
    {
        return 10 + item.cost();
    }
}
