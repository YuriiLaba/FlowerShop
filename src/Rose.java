/**
 * Created by jlaba on 10.10.2016.
 */
public class Rose extends Flower {
    private boolean spikes;

    public Rose(int fresh, int price, int stem_length, boolean spikes) {
        super(fresh, price, stem_length);
        this.spikes = spikes;
    }
}

