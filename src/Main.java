import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by jlaba on 10.10.2016.
 */
public class Main {
    public static void main(String [] args){
        LinkedList linkedlist = new LinkedList();
        //Spec cactusSpec = new CactusSpec(12,34,4);
        //Cactus flower1 = new Cactus((CactusSpec)cactusSpec, FlowerShape.STEM);
        FlowerSpec romashkaSpec1 = new FlowerSpec(12, 13);
        Romashka flower2 = new Romashka(romashkaSpec1, FlowerType.BLUE);
        Item item = new Bouquet();
        //Bouquet newBucket = new Bouquet();

        //newBucket.add(flower2);
        System.out.println(flower2.cost());
        //item = new PaperDecorator(item);
        item = new RibbonDecorator(item);
        System.out.println(item.cost());
        //item = new BasketDecorator(item);
        System.out.println(item.cost());


        //System.out.println(newBucket2.cost());
        //System.out.println(newBucket1.cost());
        //System.out.println(newBucket1.getDescription());

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
                    //newBucket.add(flower);

                } else if (type_text.equals("White")) {
                    Romashka flower = new Romashka(romashkaSpec, FlowerType.WHITE);
                    //newBucket.add(flower);
                }


            }else if (kind_text.equals("Cactus")) {

            }
        }






        //newBucket.searchFlower(flower1);

        //System.out.println(FlowerColour);

    }
}
