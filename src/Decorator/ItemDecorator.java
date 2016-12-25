package Decorator;

/**
 * Created by jlaba on 13.11.2016.
 */
public abstract class ItemDecorator implements Item {
    /**
     * This is one of the decorators types, which change behaviour during runtime
     */
    public Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }
    public abstract String getDescription();
    public int searchFlower(String name){
        return item.searchFlower(name);
    }
}
