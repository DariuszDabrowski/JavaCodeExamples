package MyPointAndMyTriangle;


public class Main {

    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(1,1,1,5,5,1);
        System.out.println(triangle);
        System.out.println(triangle.getPerimerter());
        System.out.println(triangle.getType());
    }
}
