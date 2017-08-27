package MyPointAndMyTriangle;

public class MyTriangle {
    private  MyPoint v1 = new MyPoint(0,0);
    private  MyPoint v2 = new MyPoint(0,1);
    private  MyPoint v3 = new MyPoint(1,0);


    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle[v1=(%d,%d), v2=(%d,%d), v3=(%d,%d)]", v1.getX(), v1.getY()
                , v2.getX(), v2.getY(), v3.getX(), v3.getY());
    }

    public double getPerimerter(){
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);

        return a + b + c;
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);
        String type = "";
        if (a == b && a == c && b == c)
            type = "Equilateral";
        if (a != b && a != c && b != c)
            type = "Scalene";
        if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b))
            type = "Isosceles";
        return type;
    }
}
