package Payment;

/**
 * Created by jlaba on 08.11.2016.
 */
public class PayPalPaymentStrategy implements IPayment {
    /**
     * One of the Strategy pattern
     */
    public String pay(double cost){
        return "Your bill " + cost + "was paid by PayPal";
    }

}
