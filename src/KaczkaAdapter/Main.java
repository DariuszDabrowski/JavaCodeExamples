package KaczkaAdapter;


import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {

    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();
        IndykAdapter ia = new IndykAdapter(indyk);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(ia);
        uruchomKwakanieILatanie(ptaki);

        DzikiIndyk di = new DzikiIndyk();
        DzikaKaczka dk = new DzikaKaczka();
        KaczkaAdapter ka = new KaczkaAdapter(dk);

        ArrayList<IIndyk> ptaki2 = new ArrayList<>();
        ptaki2.add(di);
        ptaki2.add(ka);
        uruchomGulgotanieILatanie(ptaki2);
    }

    public static void uruchomKwakanieILatanie(ArrayList<IKaczka> ptaki){
        for (IKaczka kaczka : ptaki){
            kaczka.kwacz();
            kaczka.lataj();
        }
    }
    public static void uruchomGulgotanieILatanie(ArrayList<IIndyk> ptaki2){
        for (IIndyk indyk : ptaki2){
            indyk.gulgocze();
            indyk.lataj();
        }
    }
}
