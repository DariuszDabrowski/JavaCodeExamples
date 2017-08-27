package MovablePoint;


public class MovablePoint extends Point{
    private float _xSpeed = 0.0f;
    private float _ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
    public MovablePoint() { super(); }

    public float getXSpeed() {return _xSpeed;}

    public void setXSpeed(float xSpeed) {
        _xSpeed = xSpeed;
    }

    public float getYspeed() { return _ySpeed;}

    public void setYspeed(float ySpeed ){_ySpeed = ySpeed;}

    public float[] getSpeed() {
        return new float[] {_xSpeed, _ySpeed};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(",speed=(")
                .append(_xSpeed + ",")
                .append(_ySpeed + ")");
        return sb.toString();
    }

    public MovablePoint move() {
        setX(getX() + _xSpeed);
        setY(getY() + _ySpeed);
        return this;
    }


}
