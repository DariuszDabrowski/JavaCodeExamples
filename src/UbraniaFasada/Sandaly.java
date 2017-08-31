package UbraniaFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class Sandaly implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram sandaly");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("rozbieram sandaly");
    }
}
