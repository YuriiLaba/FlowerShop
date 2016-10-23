/**
 * Created by jlaba on 10.10.2016.
 */
public class Flower {
    protected FlowerSpec spec;
    protected FlowerColour colour;
    protected FlowerType type;
    public Flower(FlowerType type, FlowerColour colour, double length, boolean fresh, double price){
        this.type = type;
        this.colour = colour;
        this.spec = new FlowerSpec(length, fresh, price);
    }

    public double getPrice() {
        return spec.price;
    }

    public double getLength() {
        return spec.length;
    }
    public FlowerColour getColor() {
        return colour;
    }
    public boolean getFresh() {
        return spec.fresh;
    }

    public FlowerType getType() {
        return type;
    }
    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is "
                + getColor() + " fresh leve is " + String.valueOf(getFresh()) + " its height "
                + String.valueOf(getLength());
    }
}

