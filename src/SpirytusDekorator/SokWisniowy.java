package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public class SokWisniowy extends NalewkaDekorator {

    private Nalewka nalewka;

    public SokWisniowy(Nalewka nalewka){
        this.nalewka = nalewka;
    }
    @Override
    public String getDescription() {
        return nalewka.getDescription() + ", sok wiśniowy. ";
    }

    @Override
    public int alkohol() {
        return nalewka.alkohol();
    }
}
