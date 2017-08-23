package SklepInternetowyPolimorfizm;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cd1 = new ChineseDemocracy();
        Product cd2 = new ZdrajcaMetalu();
        Product book1 = new HarryPotter();
        Product book2 = new LordOfTheRings();
        cd1.setPrice(35);
        cd2.setPrice(42);
        book1.setPrice(55);
        book2.setPrice(67);
        ArrayList<Product> list = new ArrayList<>();
        list.add(cd1);
        list.add(cd2);
        list.add(book1);
        list.add(book2);

        int sum = 0;
        for (Product p: list){
            sum += p.getPrice();
        }
        System.out.println("Suma Koszyka: " + sum);
    }

}
