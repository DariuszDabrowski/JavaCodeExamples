package TassimoDolceGusto;

/**
 * Created by Darek on 2017-09-05.
 */
public class Main {
    public static void main(String[] args) {

        Bosch bosch = new Bosch();
        Nescafe nescafe = new Nescafe();
        DolceGustoAdapter dol = new DolceGustoAdapter(nescafe);

        bosch.makeCoffee();
        nescafe.makeCoffee();
        dol.makeCoffee();

    }
}
