package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Socks extends Clothes {
    @Override
    public String getDescription() {
        return "Black socks";
    }

    @Override
    public String getName() {
        return "Socks";
    }

    @Override
    public String getSize() {
        return "L";
    }
}
