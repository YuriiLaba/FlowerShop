/**
 * Created by jlaba on 10.10.2016.
 */
public class Flower {
    private int fresh;
    private int price;
    private int stem_length;



    public Flower(int fresh, int price, int stem_length) {
        this.fresh = fresh;

        this.price = price;
        this.stem_length = stem_length;
    }
    public int getPrice() {
        return price;
    }
    public void setFresh(int fresh) {
        this.fresh = fresh;
    }

    public int getFresh() {
        return fresh;
    }

    public int getStem_length() {
        return stem_length;
    }
}

