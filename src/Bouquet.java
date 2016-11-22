import java.util.Arrays;

/**
 * Created by jlaba on 10.10.2016.
 */
public class Bouquet implements Item{
    private int full_price = 0;
    private int max = 5;
    private int count = 0;
    private Flower[] p = new Flower[max];
    private int i = 0;
    public Flower flower;


    public Flower[] add(Flower f){
        p[i] = f;
        i++;
        return p;
    }
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


    //public String sort() {
        //for(int i = 0; i < count; i++) {
            //double valueToSort = p[i].getPrice();
            //int j = i;
            //while (j > 0 && p[j - 1].getPrice() > valueToSort) {
                //p[j] = p[j - 1];
                //j--;
            //}
        //}
        //String s = "";
        //for (int i = 0; i < p.length; i ++) {
            //s += p[i].toString() + "\n";
        //}
        //return s;
    //}


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
