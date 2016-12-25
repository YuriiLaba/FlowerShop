package Delivery;

import java.util.LinkedList;

/**
 * Created by jlaba on 14.11.2016.
 */
public class PostDeliveryStrategy implements IDelivery {
    /**
     * This is Strategy pattern
     */
    public String deliver(LinkedList items){
        return "You choose Post delivery, your parcel " + items + "will be delivered till 7 days";

    }
}
