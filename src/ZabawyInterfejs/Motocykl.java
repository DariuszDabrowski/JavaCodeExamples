package ZabawyInterfejs;

/**
 * Created by RENT on 2017-08-23.
 */
public class Motocykl implements IPojazd, IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("jade motorem");
    }

    @Override
    public void stop() {
        System.out.println("chamuje motorem");
    }

    @Override
    public void skok() {
        System.out.println("skacze motorem");
    }
    public void dodajGazu(){
        System.out.println("Gaz gaz gaz");
    }
}
