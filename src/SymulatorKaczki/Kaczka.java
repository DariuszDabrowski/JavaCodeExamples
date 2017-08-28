package SymulatorKaczki;


public abstract class  Kaczka {
    ILatanie latanie;
    IKwakanie kwakanie;

//    public void kwacz(){
//        System.out.println("kwa kwa");
//    }

    public void plywaj() {
        System.out.println("Plywu plywu");
    }
    public void wyswietl(){
        System.out.println("Wyswietlam kaczke");
    }
    public void wykonaLatanie(){
        latanie.lec();
    }
    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }
    public void setKwakanieInterface(IKwakanie kwakanie){
         this.kwakanie = kwakanie;
    }
    public void setLatanieInterface(ILatanie latanie){
        this.latanie = latanie;
    }
//    public void lec(){
//        System.out.println("Kaczucha lata");
//    }

}
