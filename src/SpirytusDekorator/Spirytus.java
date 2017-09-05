package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public class Spirytus extends Nalewka {

    public Spirytus() {
        description = "Czysty Spirytus";
    }

    @Override
    public int alkohol() {
        return 90;
    }
}
