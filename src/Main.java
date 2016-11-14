import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jlaba on 10.10.2016.
 */
public class Main {
    public static void main(String [] args){
        LinkedList<Bouquet> items = new LinkedList();


        //Spec cactusSpec = new CactusSpec(12,34,4);
        //Cactus flower1 = new Cactus((CactusSpec)cactusSpec, FlowerShape.STEM);
        //FlowerSpec romashkaSpec1 = new FlowerSpec(12, 13);
        //Romashka flower2 = new Romashka(romashkaSpec1, FlowerType.BLUE);

        //Bouquet newBucket1 = new Bouquet();
        //Item item1 = newBucket1;
        //System.out.println();

        //newBucket1.add(flower2);
        //System.out.println(flower2.cost());
        //item1 = new PaperDecorator(item1);
        //item1 = new RibbonDecorator(item1);
        //item1 = new BasketDecorator(item1);
        //System.out.println(item1.getDescription());

        //System.out.println(newBucket.cost() + item);


        //System.out.println(newBucket2.cost());
        //System.out.println(newBucket1.cost());
        //System.out.println(newBucket1.getDescription());
        //Bouquet newBucket = new Bouquet();

        Bouquet newBucket = new Bouquet();
        Item item = newBucket;

        while(true) {
            System.out.println("Please, choose kind of flower: Romashka or Cactus or enter No if you choose enough flowers");
            Scanner kind_input = new Scanner(System.in);
            String kind_text = kind_input.nextLine();
            if (kind_text.equals("No")) {
                break;
            }

            else if (kind_text.equals("Romashka")) {
                System.out.println("Please, choose length of flower: ");
                Scanner length_input = new Scanner(System.in);
                int length_int = length_input.nextInt();
                System.out.println("Please, choose fresh of flower: ");
                Scanner fresh_input = new Scanner(System.in);
                int fresh_int = fresh_input.nextInt();
                FlowerSpec romashkaSpec = new FlowerSpec(length_int, fresh_int);
                System.out.println("Please, choose type of Romashka: Blue or White ");
                Scanner type_input = new Scanner(System.in);
                String type_text = type_input.nextLine();
                if (type_text.equals("Blue")) {
                    Romashka flower = new Romashka(romashkaSpec, FlowerType.BLUE);
                    newBucket.add(flower);

                } else if (type_text.equals("White")) {
                    Romashka flower = new Romashka(romashkaSpec, FlowerType.WHITE);
                    newBucket.add(flower);
                }


            }else if (kind_text.equals("Cactus")) {
                System.out.println("Please, choose length of flower: ");
                Scanner length_input_cactus = new Scanner(System.in);
                int length_cactus_int = length_input_cactus.nextInt();
                System.out.println("Please, choose shape of flower: ");
                Scanner shape_input = new Scanner(System.in);
                int shape_int = shape_input.nextInt();
                CactusSpec cactusSpec = new CactusSpec(length_cactus_int, shape_int);

                System.out.println("Please, choose type of Cactus: Needle or Stem ");
                Scanner type_cactus_input = new Scanner(System.in);
                String type_cactus_text = type_cactus_input.nextLine();
                if (type_cactus_text.equals("Needle")) {
                    Cactus flower = new Cactus(cactusSpec, FlowerShape.NEEDLE);
                    newBucket.add(flower);

                } else if (type_cactus_text.equals("Stem")) {
                    Cactus flower = new Cactus(cactusSpec, FlowerShape.STEM);
                    newBucket.add(flower);
                }

            }
        }


        System.out.println("Do you want to add Paper: Yes or Not");
        Scanner paper_input = new Scanner(System.in);
        String paper_text = paper_input.nextLine();
        if(paper_text.equals("Yes")){
            item = new PaperDecorator(item);
        }
        System.out.println("Do you want to add Basket: Yes or Not");
        Scanner Basket_input = new Scanner(System.in);
        String basket_text = Basket_input.nextLine();
        if(basket_text.equals("Yes")){
            item = new BasketDecorator(item);

        }
        System.out.println("Do you want to add Ribbon: Yes or Not");
        Scanner ribbon_input = new Scanner(System.in);
        String ribbon_text = ribbon_input.nextLine();
        if(ribbon_text.equals("Yes")){
            item = new RibbonDecorator(item);

        }
        System.out.println("Please, choose way of delivery: DHL or Post");
        Scanner delivery_input = new Scanner(System.in);
        String delivery_text = delivery_input.nextLine();

        items.add(newBucket);
        System.out.println(items);

        if(delivery_text.equals("DHL")){
            DHLDeliveryStrategy DHL = new DHLDeliveryStrategy();
            System.out.println(DHL.deliver(items));
            }
        else if(delivery_text.equals("Post")){
            PostDeliveryStrategy Post = new PostDeliveryStrategy();
            System.out.println(Post.deliver(items));
    }

 }
}

