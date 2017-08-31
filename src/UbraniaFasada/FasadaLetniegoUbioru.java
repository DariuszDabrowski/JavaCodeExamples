package UbraniaFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku{

    private Skarpetki _skarpetki;
    private Sandaly _sandaly;
    Skarpetki skar = new Skarpetki();
    Sandaly sand = new Sandaly();
    public FasadaLetniegoUbioru(Skarpetki skar, Sandaly sand){
        _skarpetki = skar;
        _sandaly = sand;
    }
    @Override
    public void ubierz() {
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();
    }

    @Override
    public void rozbierz() {
        _skarpetki.rozbierzUbranie();
        _sandaly.rozbierzUbranie();
    }
}
