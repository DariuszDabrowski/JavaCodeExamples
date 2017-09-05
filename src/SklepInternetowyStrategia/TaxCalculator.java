package SklepInternetowyStrategia;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

    private List<IProduct> _productList;
    private ITax _tax;

    public TaxCalculator(List<IProduct> productList, ITax tax){
        _productList = productList;
        _tax = tax;
    }

    public double calculateBruttoValueForAllProducts(){
        double bruttoPrice = 0.0;
        for(IProduct product : _productList){
            bruttoPrice += _tax.calculateTax(product.getPriceNetto());
        }
        return bruttoPrice;
    }

    public void showBasketWithProductsNettoAndBrutto(){
        for(IProduct product : _productList){
            System.out.printf("%s :: %.2f :: %.2f\n", product.getName(), product.getPriceNetto(),
                    _tax.calculateTax(product.getPriceNetto()));
        }
    }

    public void setTax(ITax tax){
        _tax = tax;
    }
}
