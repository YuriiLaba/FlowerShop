import Specification.Spec;

/**
 * Created by jlaba on 25.10.2016.
 */
public class Romashka extends Flower {
    protected FlowerType type;

    public Romashka(Spec spec, FlowerType type) {
        super(spec);
        this.type = type;
    }
    public double cost(){
        return 99;
    }

    public String getName(){
        return "Romashka";
    }
    public String getDescription(){
        return "Romashka";
    }
}

