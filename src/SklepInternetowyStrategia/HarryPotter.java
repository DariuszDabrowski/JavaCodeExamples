package SklepInternetowyStrategia;

public class HarryPotter implements IProduct{

    private String name;
    private double priceNetto;

    public HarryPotter(String name, double priceNetto){
        this.name = name;
        this.priceNetto = priceNetto;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPriceNetto() {
        return priceNetto;
    }
}
