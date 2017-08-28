package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void wyswietl(){
        System.out.println("Wyswietlam dzika kaczke");
    }
}
