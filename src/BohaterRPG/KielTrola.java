package BohaterRPG;

public class KielTrola extends MieczDekorator {

    Miecz miecz;

    public KielTrola(Miecz miecz){
        this.miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " z Kłem Trola";
    }

    @Override
    public int atak() {
        return miecz.atak() + 10;
    }
}
