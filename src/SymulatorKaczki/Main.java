package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {

    public static void main(String[] args) {
//        PlaskonosKaczka pk = new PlaskonosKaczka();
//        pk.wykonaLatanie();
//        pk.wykonajKwakanie();
//        DzikaKaczka dk = new DzikaKaczka();
//        dk.wykonaLatanie();
//        GumowaKaczka gk = new GumowaKaczka();
//        gk.wykonajKwakanie();
//        gk.wykonaLatanie();
//        WabikKaczka wk = new WabikKaczka();
//        wk.wykonajKwakanie();
//        wk.wykonaLatanie();
        KaczkaModel km = new KaczkaModel();
        km.wyswietl();
        km.wykonaLatanie();
        km.setLatanieInterface(new LeceZNapedemOdrzutowym());
        km.wykonaLatanie();
    }
}
