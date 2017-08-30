package BohaterRPG;

public class MieczDwureczny extends Miecz{
    @Override
    public String pobierzOpis() {
        return "Miecz Dwuręczny";
    }

    @Override
    public int atak() {
        return 40;
    }
}
