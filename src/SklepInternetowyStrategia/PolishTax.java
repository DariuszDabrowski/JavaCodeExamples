package SklepInternetowyStrategia;

public class PolishTax implements ITax {


    @Override
    public double calculateTax(double netto) {

        return netto + netto * 0.23;
    }
}
