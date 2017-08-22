package Shape;


public class Rectangle extends Shape{

    private double _with = 1.0;
    private double _length = 1.0;

    public Rectangle() {}
    public Rectangle(double with, double length) {
        _with = with;
        _length = length;
    }
    public Rectangle(double with, double length, String color, Boolean filled) {
        super(color, filled);
        _with = with;
        _length = length;
    }
    public double getWith() { return _with;}
    public void setWith(double with) {_with = with;}
    public double getLength() {return _length;}
    public void setLength(double length) {_length = length;}

    public double getArea() {
        return _length * _with;
    }
    public double getPerimeter() {return 2 * (_with + _length);}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A rectangle with width=")
                .append(_with)
                .append(" and length=")
                .append(_length)
                .append(" witch is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }

}
