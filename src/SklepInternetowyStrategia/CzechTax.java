package SklepInternetowyStrategia;

public class CzechTax implements ITax{


    @Override
    public double calculateTax(double netto) {

        return netto + netto * 0.1;
    }
}
