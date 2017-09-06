package Generics;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes();
        Jeans jeans = new Jeans();
        Suitcase<Jeans> suitcase = new Suitcase<>();
        suitcase.setThing(jeans);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingSize());
    }
}
