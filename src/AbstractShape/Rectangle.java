package AbstractShape;


public class Rectangle extends Shape {

    protected double _width = 1.0;
    protected double _length = 1.0;

    public Rectangle() {}
    public Rectangle(double with, double length) {
        _width = with;
        _length = length;
    }
    public Rectangle(double with, double length, String color, Boolean filled) {
        super(color, filled);
        _width = with;
        _length = length;
    }
    public double getWidth() { return _width;}
    public void setWidth(double width) {
        _width = width;}
    public double getLength() {return _length;}
    public void setLength(double length) {_length = length;}
    @Override
    public double getArea() {
        return _length * _width;
    }
    @Override
    public double getPerimeter() {return 2 * (_width + _length);}

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width=")
                .append(_width)
                .append(" and length=")
                .append(_length)
                .append(" which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }

}
