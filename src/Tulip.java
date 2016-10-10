/**
 * Created by jlaba on 10.10.2016.
 */
public class Tulip extends Flower {
    private String colour;

    public Tulip(int fresh, int price, int stem_length, String colour) {
        super(fresh, price, stem_length);
        this.colour = colour;
    }
}

