package ZabawyInterfejs;

/**
 * Created by RENT on 2017-08-23.
 */
public class Rower implements IPojazd, IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("jade rowerem");
    }

    @Override
    public void stop() {
        System.out.println("chamuje rowerem");
    }

    @Override
    public void skok() {
        System.out.println("skacze na rampie");
    }
}
