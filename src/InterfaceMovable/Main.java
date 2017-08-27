package InterfaceMovable;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1,1,2,3);
        System.out.println("-------POINT --------");
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
        MovableCircle circle = new MovableCircle(2,2,1,2,3);
        System.out.println("-------CIRCLE-------");
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
    }
}
