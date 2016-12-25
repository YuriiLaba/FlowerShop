/**
 * Created by jlaba on 25.10.2016.
 */
public enum FlowerShape {
    /**
     * Choose shape for cactus
     */
    NEEDLE, STEM;
    public String toString(){
        String a = "";
        switch(this){
            case NEEDLE: a = "Needle"; break;
            case STEM: a = "Stem"; break;
            default: a = "Without any shape"; break;
        }return a;
    }
}
