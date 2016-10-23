/**
 * Created by jlaba on 10.10.2016.
 */
public class Main {
    public static void main(String [] args){
        Flower flower1 = new Flower(FlowerType.ROSE, FlowerColour.BLACK, 10, true, 10);
        Flower flower2 = new Flower(FlowerType.ROSE, FlowerColour.BLUE, 10, true, 10);
        Flower flower3 = new Flower(FlowerType.TULIP, FlowerColour.BLACK, 10, true, 10);
        Flower flower4 = new Flower(FlowerType.ROSE, FlowerColour.RED, 10, true, 10);
        Bouquet newBucket = new Bouquet();
        newBucket.add(flower1);
        newBucket.add(flower2);
        newBucket.add(flower3);
        newBucket.add(flower4);


        newBucket.searchFlower(flower1);

        //System.out.println(FlowerColour);

    }
}
