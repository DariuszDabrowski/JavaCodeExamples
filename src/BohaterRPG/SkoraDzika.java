package BohaterRPG;

public class SkoraDzika extends TarczaDekorator{

    Tarcza tarcza;

    public SkoraDzika(Tarcza tarcza){
        this.tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return tarcza.pobierzOpis() + " pokryta skórą dzika";
    }

    @Override
    public int obrona() {
        return tarcza.obrona() + 10;
    }
}
