import Decorator.Item;
import Delivery.IDelivery;
import Observer.CactusSapplierObserver;
import Observer.RomashkaSapplierObserver;
import Payment.IPayment;

import java.util.LinkedList;
import java.util.Observable;


/**
 * Created by jlaba on 08.11.2016.
 */
public class Order extends Observable {
    public LinkedList<Item> items;
    protected IPayment payment;
    protected IDelivery delivery;

    public Order(){
        items = new LinkedList<>();
    }
    public void proccessOrder(){
        getDeliveryStrategy().deliver(items);
        getPaymentStrategy().pay(calculateTotalPrice());

        new CactusSapplierObserver().update(this, items);
        new RomashkaSapplierObserver().update(this, items);

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

            //System.out.println(item.cost());

            totalPrace += item.cost();
        }
        return totalPrace;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }


}
