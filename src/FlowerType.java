/**
 * Created by jlaba on 23.10.2016.
 */
public enum FlowerType {
    ROSE, TULIP;
    public String toString(){
        String a = "";
        switch(this){
            case ROSE: a = "Rose"; break;
            case TULIP: a = "Tulip"; break;
            default: a = "Without any type"; break;
        }return a;
    }
}
