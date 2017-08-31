package BohaterRPG;

public class Main {

    public static void main(String[] args) {

        Bohater bezimienny = new Bohater();
        System.out.println(bezimienny);

        ZelaznaTarcza zt = new ZelaznaTarcza();
        SkoraTrola st = new SkoraTrola(zt);
        SmoczaLuska sl = new SmoczaLuska(st);

        MieczDwureczny md = new MieczDwureczny();
        MagicznaRuda mr = new MagicznaRuda(md);
        LzyInnosa li = new LzyInnosa(mr);

        PlecakWojownika pw = new PlecakWojownika();
        ZloteNici zn = new ZloteNici(pw);

        Bohater gorn = new Bohater();
        gorn.setImie("Gorn");
        gorn.setTarcza(sl);
        gorn.setMiecz(li);
        gorn.setPlecak(zn);
        System.out.println(gorn);

//        MieczDwureczny mdw = new MieczDwureczny();
//        MagicznaRuda mr = new MagicznaRuda(mdw);
//        LzyInnosa li = new LzyInnosa(mr);
//        System.out.printf("Nazwa: %s -> %d ataku."
//                , li.pobierzOpis(), li.atak());
    }
}
