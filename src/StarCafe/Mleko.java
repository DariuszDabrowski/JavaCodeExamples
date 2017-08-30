package StarCafe;

/**
 * Created by RENT on 2017-08-30.
 */
public class Mleko extends SkladnikiDekorator {

    private Napoj _napoj;

    public Mleko(Napoj napoj){
        _napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return _napoj.pobierzOpis() +  " Mleko";
    }

    @Override
    public double koszt() {
        return _napoj.koszt() + 0.1;
    }
}
