package BohaterRPG;

public class MieczDlugi extends Miecz {
    @Override
    public String pobierzOpis() {
        return "Długi Miecz";
    }

    @Override
    public int atak() {
        return 25;
    }
}
