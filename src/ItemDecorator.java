/**
 * Created by jlaba on 13.11.2016.
 */
public abstract class ItemDecorator implements Item{
    public Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }
    public abstract String getDescription();
}
