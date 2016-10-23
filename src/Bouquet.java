

/**
 * Created by jlaba on 10.10.2016.
 */
public class Bouquet {
    private int full_price = 0;
    private int max = 5;
    int count = 0;
    private Flower[] p = new Flower[max];
    private int i = 0;

    public int add(Flower o){
        p[i] = o;
        full_price += p[i].getPrice();
        i++;
        return full_price;
    }

    public String sort() {
        for(int i = 0; i < count; i++) {
            double valueToSort = p[i].getPrice();
            int j = i;
            while (j > 0 && p[j - 1].getPrice() > valueToSort) {
                p[j] = p[j - 1];
                j--;
            }
        }
        String s = "";
        for (int i = 0; i < p.length; i ++) {
            s += p[i].toString() + "\n";
        }
        return s;
    }


    public Flower[] searchFlower(Flower flower){
        int count1 = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getColor() == flower.getColor() || (p[i].getLength() == flower.getLength() ||
                    (p[i].getPrice() == flower.getPrice()) || (p[i].getFresh() == flower.getFresh()))){
                count1 +=1;
            }





        }Flower[] lst = new Flower[count1];
        for (int a = 0; a < lst.length; a++){
            for (int i = 0; i < p.length; i++) {
                if (p[i].getColor() == flower.getColor() || (p[i].getLength() == flower.getLength()))
                    lst[a] = p[i];
            }


        }return lst;


    }
}
