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

    }


}
