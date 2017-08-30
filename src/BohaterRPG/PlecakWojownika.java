package BohaterRPG;

public class PlecakWojownika extends Plecak {
    @Override
    public String pobierzOpis() {
        return "Plecak Wojownika";
    }

    @Override
    public int pojemnosc() {
        return 7;
    }
}
