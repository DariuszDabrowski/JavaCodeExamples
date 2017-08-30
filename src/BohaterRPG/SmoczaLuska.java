package BohaterRPG;

public class SmoczaLuska extends TarczaDekorator {
    Tarcza tarcza;

    public SmoczaLuska(Tarcza tarcza){
        this.tarcza = tarcza;
    }

    @Override
    public String pobierzOpis() {
        return tarcza.pobierzOpis() + " pokryta Smoczą Luską";
    }

    @Override
    public int obrona() {
        return tarcza.obrona() + 30;
    }
}
