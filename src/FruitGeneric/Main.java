package FruitGeneric;


public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana();
        FruitBasket<Banana> basket = new FruitBasket<>();
        basket.setFruit(banana);
        System.out.println(basket.getFruitName());
        System.out.println(basket.getFruiColor());

    }
}
