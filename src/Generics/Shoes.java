package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Shoes extends Clothes{
    @Override
    public String getDescription() {
        return "Black shoes";
    }

    @Override
    public String getName() {
        return "Shoes";
    }

    @Override
    public String getSize() {
        return "44";
    }
}
