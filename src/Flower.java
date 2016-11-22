/**
 * Created by jlaba on 10.10.2016.
 */
public abstract class Flower {
    protected Spec spec;
    protected FlowerShape shape;
    //protected FlowerColour colour;

    public Flower( Spec spec){
        this.spec = spec;
    }

    //public double getPrice() {
        //return spec.price;
    //}


    public abstract double cost();
    public abstract String getDescription();
    public abstract String getName();





    //public String toString() {
        //return "Price is " + String.valueOf(getPrice()) + " its color is "
                //+ getColor()  + " its height "
                //+ String.valueOf(getLength());
    //}
}

