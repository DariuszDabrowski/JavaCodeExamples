package FruitGeneric;


public class Banana implements IFruit {
    @Override
    public String getName() {
        return "Banana";
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
