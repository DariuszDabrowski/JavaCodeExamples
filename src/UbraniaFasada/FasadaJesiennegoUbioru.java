package UbraniaFasada;

/**
 * Created by Darek on 2017-09-05.
 */
public class FasadaJesiennegoUbioru implements IUbranieNaPoreRoku {
    private Jeansy _jeansy;
    KurtkaWiatrowa _kw;
    public FasadaJesiennegoUbioru(Jeansy jeansy, KurtkaWiatrowa kw){
        _jeansy = jeansy;
        _kw = kw;
    }
    @Override
    public void ubierz() {
        _jeansy.ubierzUbranie();
        _kw.ubierzUbranie();
    }

    @Override
    public void rozbierz() {
        _kw.rozbierzUbranie();
        _jeansy.rozbierzUbranie();
    }
}
