package TassimoDolceGusto;

/**
 * Created by Darek on 2017-09-05.
 */
public class DolceGustoAdapter implements ITassimo {

    private Nescafe nescafe;

    public DolceGustoAdapter(Nescafe nescafe){
        this.nescafe = nescafe;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Make coffee using Dolce-Gusto!");
    }
}
