package Shape;

/**
 * Created by RENT on 2017-08-22.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow", true);
        System.out.println(shape);
        Circle circle = new Circle(2, "green", true);
        System.out.println(circle);
        Rectangle rec = new Rectangle(2,4, "pink", false);
        System.out.println(rec);
    }
}
