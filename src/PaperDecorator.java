/**
 * Created by jlaba on 13.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    Item item;
    public PaperDecorator(Bouquet bouquet) {
        this.item = bouquet;
    }
    public String getDescription() {
        return item.getDescription() + ", Paper";
    }
    public double cost() {
        return 13 + item.cost();
    }
}
