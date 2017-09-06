package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Jeans extends Clothes implements ICanBeFolded{
    @Override
    public String getDescription() {
        return "Blue Jeans";
    }

    @Override
    public String getName() {
        return "Jeans";
    }

    @Override
    public String getSize() {
        return "XXL";
    }
}
