package BohaterRPG;

public class MieczKrotki extends Miecz {
    @Override
    public String pobierzOpis() {
        return "Krótki Miecz";
    }

    @Override
    public int atak() {
        return 10;
    }
}
