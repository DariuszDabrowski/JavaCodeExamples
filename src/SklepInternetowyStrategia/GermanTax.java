package SklepInternetowyStrategia;

public class GermanTax implements ITax{

    @Override
    public double calculateTax(double netto) {

        return netto + netto * 0.3;
    }
}
