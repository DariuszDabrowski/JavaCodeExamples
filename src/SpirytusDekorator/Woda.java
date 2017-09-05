package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public class Woda extends NalewkaDekorator {
    private Nalewka nalewka;

    public Woda(Nalewka nalewka){
        this.nalewka = nalewka;
    }
    @Override
    public String getDescription() {
        return nalewka.getDescription();
    }

    @Override
    public int alkohol() {
        return nalewka.alkohol() - 8;
    }
}
