package SklepInternetowyStrategia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<IProduct> products = new ArrayList<>();
        products.add(new HarryPotter("Harry Potter", 12.99));
        products.add(new LordOfTheRings("Lord of the Rings", 9.99));


        ITax plTax = new PolishTax();
        ITax deTax = new GermanTax();
        ITax usaTax = new USATax();
        ITax czTax = new CzechTax();

        TaxCalculator calc = new TaxCalculator(products, plTax);

        calc.showBasketWithProductsNettoAndBrutto();
        calc.setTax(deTax);
        calc.showBasketWithProductsNettoAndBrutto();
        calc.setTax(usaTax);
        calc.showBasketWithProductsNettoAndBrutto();
    }
}
