package Decorator;

/**
 * Created by jlaba on 14.11.2016.
 */
public class BasketDecorator extends ItemDecorator {

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
