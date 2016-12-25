/**
 * Created by jlaba on 19.12.2016.
 */
public class RomashkaWeddingBouquet extends Bouquet {
    /**
     * Here is factory of only romashkas bouquets
     */
    private int max = 5;
    private Flower[] p = new Romashka[max];
    private int i = 0;


    public Flower[] add(Flower f) {
        if (!(f instanceof Romashka)){
            throw new IllegalArgumentException("You can add only Romaska to this bucket");
        }
        p[i] = f;
        i++;
        return p;
    }

    @Override
    public String getDescription(){
        String final_description = "";
        for (Flower flower: p){
            if(flower != null){
                final_description += flower.getDescription();
            }else{
                break;
            }
        }return final_description;
    }

    @Override
    public double cost(){
        double sum = 0;
        for (Flower flower: p){
            if(flower != null){
                sum += flower.cost();
            }else{
                break;
            }
        }return sum;
    }


    public int searchFlower(String name){
        int count = 0;


        for (int i = 0; i < p.length; i++) {

            if(p[i] == null){
                continue;
            }
            else if (name.equals(p[i].getName())) {
                count++;

            }
        }

        return count;
    }
    public String toString() {
        return String.valueOf(getDescription());
    }
}
