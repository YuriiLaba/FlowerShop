/**
 * Created by jlaba on 14.11.2016.
 */
public class BasketDecorator extends ItemDecorator {
    Item item;
    public BasketDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return item.getDescription() + ", Basket";
    }
    public double cost() {
        return 10 + item.cost();
    }
}
