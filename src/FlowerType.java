/**
 * Created by jlaba on 23.10.2016.
 */
public enum FlowerType {
    BLUE, WHITE;
    public String toString(){
        String a = "";
        switch(this){
            case BLUE: a = "Blue"; break;
            case WHITE: a = "White"; break;
            default: a = "Without any type"; break;
        }return a;
    }
}
