/**
 * Created by jlaba on 08.11.2016.
 */
public class PayPalPaymentStrategy extends IPayment {
    public String pay(double cost){
        return "Your bill " + cost + "was paid by PayPal";
    }

}
