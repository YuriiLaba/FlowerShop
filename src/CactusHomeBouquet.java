/**
 * Created by jlaba on 25.12.2016.
 */
public class CactusHomeBouquet extends Bouquet {
    private int max = 5;
    private Flower[] p = new Cactus[max];
    private int i = 0;


    public Flower[] add(Flower f) {
        if (!(f instanceof Cactus)){
            throw new IllegalArgumentException("You can add only Cactus to this bucket");
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
