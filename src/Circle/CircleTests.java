package Circle;


import org.junit.Assert;
import org.junit.Test;

public class CircleTests {


    @Test
    public void circleAreaTest(){
        Circle circle = new Circle();
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }
    @Test
    public void circleDefaultRadiusTest(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleAreaRadiusTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(12.56, circle.getArea(), 0.01);
    }
    @Test
    public void circleRadius2Test(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.getRadius(), 0.1);
    }
    @Test
    public void circleToStringTest(){
        Circle circle = new Circle(2.0);
        Assert.assertEquals("Circle[radius = 2.0 ,color = red]", circle.toString());
    }
    @Test
    public void circleConstructorTest(){
        Circle circle = new Circle(2.0, "blue");
        Assert.assertEquals("blue", circle.getColor());
    }
    @Test
    public void circleSetColorTest(){
        Circle circle = new Circle(2.0, "blue");
        circle.setColor("green");
        Assert.assertEquals("green", circle.getColor());
    }


}
