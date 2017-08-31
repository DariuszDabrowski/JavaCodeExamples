package UbraniaFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {

    public static void main(String[] args) {
        Skarpetki skar = new Skarpetki();
        Sandaly sand = new Sandaly();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(skar, sand);
        StrategiaUbioru su = new StrategiaUbioru(flu);
        su.ubieramySie();
        su.rozbieramySie();
    }
}
