import java.util.LinkedList;

/**
 * Created by jlaba on 08.11.2016.
 */
public class Order {
    public LinkedList<Bouquet> items;
    protected IPayment payment;
    protected IDelivery delivery;

    public Order(){
        items = new LinkedList<>();
    }
    public void proccessOrder(){
        getDeliveryStrategy().deliver(items);
        getPaymentStrategy().pay(calculateTotalPrice());
    }
    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public IDelivery getDeliveryStrategy() {
        return this.delivery;
    }

    public IPayment getPaymentStrategy() {
        return this.payment;
    }

    public double calculateTotalPrice() {
        double totalPrace = 0.0;
        for (Item item: items) {

            totalPrace += item.cost();
        }
        return totalPrace;
    }

    public void addItem(Item item) {
        items.add((Bouquet) item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }


}
