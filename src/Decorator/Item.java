package Decorator;

/**
 * Created by jlaba on 08.11.2016.
 */
public interface Item {
    /**
     * Interface which implements all kinds of decorators
     */
    String description = "Unknown flower";
    public String getDescription();
    public  double cost();
    int searchFlower(String name);

}
