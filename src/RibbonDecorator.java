/**
 * Created by jlaba on 14.11.2016.
 */
public class RibbonDecorator extends ItemDecorator {
    Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription() + ", Ribbon";
    }
    public double cost() {
        return 4 + this.item.cost();
   }
}
