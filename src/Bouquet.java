/**
 * Created by jlaba on 10.10.2016.
 */
public class Bouquet {
    private int full_price = 0;
    int count = 0;
    private int max = 5;
    private Flower[] p = new Flower[max];
    private int i = 0;

    public int add(Flower o){
        p[i] = o;
        full_price += p[i].getPrice();
        i++;
        return full_price;
    }

    public Flower[] sort() {
        for(int i = 0; i < count; i++) {
            int valueToSort = p[i].getFresh();
            int j = i;
            while (j > 0 && p[j - 1].getFresh() > valueToSort) {
                p[j] = p[j - 1];
                j--;
            }
            p[j].setFresh(valueToSort);
        }
        return p;
    }
    public void flowerFind(double first, double second) {
        for(int u = 0; u <p.length; u++) {
            if(p[u] != null){
                count +=1;
            }
        }
        for(int c = 0; c < count; c++) {
            if(p[c].getStem_length() < second && p[c].getStem_length() > first){
                System.out.println(p[c]);
                break;
            }
        }

    }
}
