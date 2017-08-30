package StarCafe;

public class Main {

    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        BitaSmietana bs = new BitaSmietana(czek);
        System.out.printf("Nazwa: %s :: Cena: %.2f",bs.pobierzOpis(), bs.koszt());
    }
}
