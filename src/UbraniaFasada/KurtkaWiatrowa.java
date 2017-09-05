package UbraniaFasada;

/**
 * Created by Darek on 2017-09-05.
 */
public class KurtkaWiatrowa implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram kurtkę wiatrową");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Rozbieram kurtkę wiatrową");

    }
}
