package BohaterRPG;

public class MagicznaRuda extends MieczDekorator {
    Miecz miecz;

    public MagicznaRuda(Miecz miecz){
        this.miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " z Magicznej Rudy";
    }

    @Override
    public int atak() {
        return miecz.atak() + 20;
    }
}
