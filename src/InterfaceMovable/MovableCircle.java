package InterfaceMovable;

public class MovableCircle implements IMovable{

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed
            , int ySpeed, int radius){
        this.center=new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return String.format("[" + center.toString()
                + ", radius=%d]", radius);
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
