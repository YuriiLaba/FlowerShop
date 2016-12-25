/**
 * Created by jlaba on 24.12.2016.
 */
public enum BouquetType {
    /**
     * Here is factory of bouquets
     */
    ROMASHKA_WEDDING_BOUQUET, CACTUS_HOME_BOUQUET, COMBINE_BOUQUET;
    public Bouquet toBouquet(){
        //Bouquet bouquet ;
        switch(this){
            case ROMASHKA_WEDDING_BOUQUET: Bouquet bouquet = new RomashkaWeddingBouquet();
                return bouquet;
            case CACTUS_HOME_BOUQUET: Bouquet bouquet1 = new CactusHomeBouquet();
                return bouquet1;
            case COMBINE_BOUQUET: Bouquet bouquet2 = new CombineBouquet();
                return bouquet2;
        }return null;
    }
}
