package SpirytusDekorator;

/**
 * Created by Darek on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {
        Spirytus spirytus = new Spirytus();
        Woda woda1 = new Woda(spirytus);
        Woda woda2 = new Woda(woda1);
        Woda woda3 = new Woda(woda2);
        SokWisniowy wisniowka = new SokWisniowy(woda3);
        System.out.println(wisniowka.getDescription());
        System.out.println();
        System.out.println(wisniowka.alkohol());
    }
}
