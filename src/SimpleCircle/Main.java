package SimpleCircle;


public class Main {

    public static void main(String[] args) {

        SimpleCircle c = new SimpleCircle(4.5);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
        c.setRadius(6.66);
        System.out.println(c.toString());

    }
}
