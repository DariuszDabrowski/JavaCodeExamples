package BohaterRPG;

public class ZelaznaTarcza extends Tarcza {
    @Override
    public String pobierzOpis() {
        return "Żelazna Tarcza";
    }

    @Override
    public int obrona() {
        return 30;
    }
}
