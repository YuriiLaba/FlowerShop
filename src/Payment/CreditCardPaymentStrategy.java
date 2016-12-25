package Payment;

/**
 * Created by jlaba on 08.11.2016.
 */
public class CreditCardPaymentStrategy implements IPayment {
    /**
     * One of the Strategy pattern
     */
    public String pay(double cost){
        return "Your bill " + cost + "was paid by Credit Card";
    }

}
