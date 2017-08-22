package Shape;

public class Square extends Rectangle{

    public Square() {}

    public Square(double side) {
        super.setWith(side);
        super.setLength(side);
    }
    public Square(double side, String color, Boolean filled) {
        super.setWith(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide() {
        return getWith();
    }
    public void setSide(double side) {

    }
    public void setWith(double side) {

    }
    public void setLength(double side) {

    }
    public String toString() {
        return super.toString();
    }


    
}
