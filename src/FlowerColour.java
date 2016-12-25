/**
 * Created by jlaba on 23.10.2016.
 */
public enum FlowerColour {
    /**
     * Choose colour for flower
     */
    BLACK, RED, PINK, BLUE;
    public String toString(){
        String a = "";
        switch(this){
            case BLACK: a = "Black"; break;
            case RED: a = "Red"; break;
            case PINK: a = "Pink"; break;
            case BLUE: a = "Blue"; break;
            default: a = "Without any colour"; break;
        }return a;
    }
}
