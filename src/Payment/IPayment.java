package Payment;

/**
 * Created by jlaba on 14.11.2016.
 */
public interface IPayment {
    /**
     * This is an interface which implements all kinds of Payment Strategy
     */
    public String pay(double cost);
}
