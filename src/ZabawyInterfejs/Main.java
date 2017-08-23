package ZabawyInterfejs;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        ICzterokolowy samochod1 = new Samochod();
        samochod1.drift();

        Motocykl motocykl = new Motocykl();
        motocykl.dodajGazu();
    }
}
