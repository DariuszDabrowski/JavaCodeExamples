package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class WabikKaczka extends Kaczka{
    public WabikKaczka(){
        latanie =new NieLatam();
        kwakanie = new NieKwacz();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wabik kaczucha");
    }
}
