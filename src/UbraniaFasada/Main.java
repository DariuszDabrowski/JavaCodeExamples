package UbraniaFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {

    public static void main(String[] args) {
        Skarpetki skar = new Skarpetki();
        Sandaly sand = new Sandaly();
        KurtkaWiatrowa kw = new KurtkaWiatrowa();
        Jeansy jeansy = new Jeansy();

        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(skar, sand);
        FasadaJesiennegoUbioru fju = new FasadaJesiennegoUbioru(jeansy, kw);

        StrategiaUbioru su = new StrategiaUbioru(flu);
        su.ubieramySie();
        System.out.println("------");
        su.rozbieramySie();
        System.out.println("Nadchodzi jesień");
        su.setPoraRoku(fju);
        su.ubieramySie();
        System.out.println("------");
        su.rozbieramySie();
    }
}
