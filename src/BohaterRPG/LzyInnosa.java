package BohaterRPG;

public class LzyInnosa extends MieczDekorator{
    Miecz miecz;

    public LzyInnosa(Miecz miecz){
        this.miecz = miecz;
    }

    @Override
    public String pobierzOpis() {
        return miecz.pobierzOpis() + " ze Lzami Innosa";
    }

    @Override
    public int atak() {
        return miecz.atak() + 40;
    }
}
