package AbstractShape;

/**
 * Created by RENT on 2017-08-22.
 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5, "green", true);
        System.out.println(circle);
        Rectangle rec = new Rectangle(2,4, "pink", false);
        System.out.println(rec);
        Square sq = new Square();
        sq.setWidth(3);
        System.out.println(sq);
    }
}
