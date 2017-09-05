package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public class SokMalinowy extends NalewkaDekorator {

    private Nalewka nalewka;

    public SokMalinowy(Nalewka nalewka){
        this.nalewka = nalewka;
    }

    @Override
    public String getDescription() {
        return nalewka.getDescription() + ", sok malinowy";
    }

    @Override
    public int alkohol() {
        return nalewka.alkohol();
    }
}
