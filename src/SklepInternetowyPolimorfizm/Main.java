package SklepInternetowyPolimorfizm;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new ChineseDemocracy());
        products.add(new ZdrajcaMetalu());
        products.add(new HarryPotter());
        products.add(new LordOfTheRings());

        int sum = 0;
        for(Product product : products){
            sum = sum + product.getPrice();
        }

        System.out.printf("Twoje zakupy będą kosztować: %d zł", sum);
    }

}
