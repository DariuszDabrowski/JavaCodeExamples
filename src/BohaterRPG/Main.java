package BohaterRPG;

public class Main {

    public static void main(String[] args) {
        MieczDwureczny mdw = new MieczDwureczny();
        MagicznaRuda mr = new MagicznaRuda(mdw);
        LzyInnosa li = new LzyInnosa(mr);
        System.out.printf("Nazwa: %s -> %d ataku."
                , li.pobierzOpis(), li.atak());
    }
}
