import Decorator.Item;

/**
 * Created by jlaba on 10.10.2016.
 */
public abstract class Bouquet implements Item {

    public abstract Flower[] add(Flower f);

    public abstract String getDescription();

    public abstract double cost();

    public abstract int searchFlower(String name);

    public abstract String toString();
}
