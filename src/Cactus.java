/**
 * Created by jlaba on 25.10.2016.
 */
public class Cactus extends Flower {
    protected FlowerShape shape;

    public FlowerShape getShape() {
        return shape;
    }

    public Cactus(CactusSpec spec, FlowerShape shape) {
        super(spec);

        this.shape = shape;
    }

    public double cost(){
        return 129;
    }

    public String getName(){
        return "Cactus";
    }

    public String getDescription(){
        return "Cactus" + " (" + getShape() + ") ";
    }
}
