import java.util.LinkedList;

/**
 * Created by jlaba on 14.11.2016.
 */
public class DHLDeliveryStrategy extends IDelivery {
    public String deliver(LinkedList items){
        return "You choose DHL delivery, your parcel " + items + " will be delivered till 5 days";

    }

}
