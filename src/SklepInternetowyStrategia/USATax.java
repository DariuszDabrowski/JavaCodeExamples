package SklepInternetowyStrategia;

public class USATax implements ITax{

    @Override
    public double calculateTax(double netto) {

        return netto + netto * 0.15;
    }
}
