package Rectangle;


public class Rectangle {

    private float _length = 1.0f;
    private float _width = 1.0f;

    public Rectangle() {};

    public Rectangle(float length, float with) {
        _length = length;
        _width = with;
    }

    public float getLength() {
        return _length;
    }

    public void setLength(float length) {
        _length = length;
    }

    public float getWidth() {
        return _width;
    }

    public void setWidth(float width) {
        _width = width;
    }

    public double getArea() {
        return _length * _width;
    }

    public double getPerimeter() {
        return 2 * (_length + _width);
    }

    public String toString() {
        return "Rectangle[length=" + _length + ",width=" + _width + "]";
    }


}
