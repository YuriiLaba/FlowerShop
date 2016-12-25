import Decorator.BasketDecorator;
import Decorator.Item;
import Decorator.PaperDecorator;
import Decorator.RibbonDecorator;
import Delivery.PostDeliveryStrategy;
import Order.Order;
import Payment.PayPalPaymentStrategy;
import Specification.CactusSpec;
import Specification.FlowerSpec;
import Specification.Spec;


/**
 * Created by jlaba on 15.11.2016.
 */
public class Order_Main {
    public static void main(String [] args){
        Order myOrder = new Order();
        myOrder.setDeliveryStrategy(new PostDeliveryStrategy());
        myOrder.setPaymentStrategy(new PayPalPaymentStrategy());
        //Bouquet newBucket = new RomashkaWeddingBouquet();
        //Bouquet newBucket1 = new RomashkaWeddingBouquet();
        Spec cactusSpec = new CactusSpec(12,34);
        Cactus flower1 = new Cactus((CactusSpec)cactusSpec, FlowerShape.STEM);
        Spec cactusSpec1 = new CactusSpec(12,34);
        Cactus flower2 = new Cactus((CactusSpec)cactusSpec1, FlowerShape.STEM);
        Spec flowerSpec = new FlowerSpec(12,34);
        Romashka flower3 = new Romashka(flowerSpec, FlowerType.BLUE);
        Bouquet romWedBouquet = BouquetType.ROMASHKA_WEDDING_BOUQUET.toBouquet();
        Bouquet cacHomBouquet = BouquetType.CACTUS_HOME_BOUQUET.toBouquet();
        //System.out.println(romWedBouquet.getClass());
        romWedBouquet.add(flower3);
        cacHomBouquet.add(flower1);
        //newBucket1.add(flower2);
        //newBucket.add(flower2);

        Item item = romWedBouquet;
        Item item1 = cacHomBouquet;
        //myOrder.addItem(item);
        item = new PaperDecorator(item);
        //myOrder.addItem(item);
        item = new RibbonDecorator(item);
        //myOrder.addItem(item);
        item = new BasketDecorator(item);


        //newBucket.add(flower1);
        //newBucket1.add(flower2);
        //newBucket.add(flower2);

        //Item item = newBucket;
        //myOrder.addItem(item);
        //item = new PaperDecorator(item);
        //myOrder.addItem(item);
        //item = new RibbonDecorator(item);
        //myOrder.addItem(item);
        //item = new BasketDecorator(item);
        //myOrder.addItem(item);
        //System.out.println(item.cost());
        myOrder.addItem(item);
        myOrder.addItem(item1);
        //myOrder.addItem(newBucket1);
        myOrder.proccessOrder();

        System.out.println("Total price: ");
        System.out.println(myOrder.calculateTotalPrice());
    }
}
