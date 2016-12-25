package Delivery;

import java.util.LinkedList;

/**
 * Created by jlaba on 14.11.2016.
 */
public interface IDelivery {
    /**
     * This is an interface which implements all kinds of Delivery Strategy
     */
    public String deliver(LinkedList items);
}
