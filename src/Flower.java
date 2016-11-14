/**
 * Created by jlaba on 10.10.2016.
 */
public class Flower {
    protected Spec spec;
    protected FlowerShape shape;
    //protected FlowerColour colour;

    public Flower( Spec spec){
        this.spec = spec;
    }

    //public double getPrice() {
        //return spec.price;
    //}

    public double getLength()
    {
        return spec.length;
    }

    public double cost(){
        return 0;
    }
    public String getDescription(){
        return "";
    }




    //public String toString() {
        //return "Price is " + String.valueOf(getPrice()) + " its color is "
                //+ getColor()  + " its height "
                //+ String.valueOf(getLength());
    //}
}

