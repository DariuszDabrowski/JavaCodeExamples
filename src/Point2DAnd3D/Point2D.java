package Point2DAnd3D;


public class Point2D {
    private float _x = 0.0f;
    private float _y = 0.0f;

    public Point2D() {};

    public Point2D(float x, float y){
        _x = x;
        _y = y;
    }

    public float getX() {
        return _x;
    }

    public void setX(float x) {
        _x = x;
    }

    public float getY() { return _y; }

    public void setY(float y) { _y = y;}

    public void setXY(float x, float y) {
        _x = x;
        _y = y;
    }

    public float[] getXY() {
        return new float[]{_x, _y};
    }
    public String toString() {
        return String.format("(%f, %f)", _x, _y);
    }
}
