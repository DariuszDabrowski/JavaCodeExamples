package ZabawyInterfejs;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements IPojazd, ICzterokolowy{
    @Override
    public void jedz() {
        System.out.println("Brum Brum");
    }

    @Override
    public void stop() {
        System.out.println("Chamuj");
    }

    @Override
    public void drift() {
        System.out.println("Pisk Opon");
    }
}
