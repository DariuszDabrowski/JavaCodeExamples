package ResizableCircle;

public class Main {

    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(3.5);
        System.out.println(circle);
        circle.resize(130);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
