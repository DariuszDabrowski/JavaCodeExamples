package BohaterRPG;

public class ZloteNici extends PlecakDekorator {
    Plecak plecak;

    public ZloteNici(Plecak plecak){
        this.plecak = plecak;
    }

    @Override
    public String pobierzOpis() {
        return plecak.pobierzOpis() + " ze złotych nici";
    }

    @Override
    public int pojemnosc() {
        return plecak.pojemnosc() + 2;
    }
}
