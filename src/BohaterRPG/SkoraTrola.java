package BohaterRPG;

public class SkoraTrola extends TarczaDekorator {

    Tarcza tarcza;

    public SkoraTrola(Tarcza tarcza){
        this.tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return tarcza.pobierzOpis() + " pokryta skórą Trola";
    }

    @Override
    public int obrona() {
        return tarcza.obrona() + 20;
    }
}
