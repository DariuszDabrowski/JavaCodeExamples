package BohaterRPG;

public class SrebneNici extends PlecakDekorator {

    Plecak plecak;

    public SrebneNici(Plecak plecak){
        this.plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return plecak.pobierzOpis() + " ze srebnych nici";
    }

    @Override
    public int pojemnosc() {
        return plecak.pojemnosc() + 1;
    }
}
