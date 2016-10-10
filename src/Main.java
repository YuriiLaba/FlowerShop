/**
 * Created by jlaba on 10.10.2016.
 */
public class Main {
    public static void main(String [] args){
        Tulip obj1 = new Tulip(12, 13, 24, "black");
        Tulip obj2 = new Tulip(10,11,100, "red");
        Rose obj3 = new Rose(15,18,40, true);
        Rose obj4 = new Rose(10,13,90, false);
        Tulip obj5 = new Tulip(17,18,3, "pink");
        Bouquet y = new Bouquet();
        y.add(obj1);
        y.add(obj2);
        y.add(obj3);
        y.add(obj4);
        y.add(obj5);
        y.flowerFind(13.0,41.0);
        y.sort();

    }
}
