package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class CircleAndCylinderTests {

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
    @Test
    public void cylinderDefaultConstructorTest(){
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals("red", cylinder.getColor());
        Assert.assertEquals(1.0, cylinder.getRadius(), 0.01);
    }
    @Test
    public void cylinderConstructorOneParameterTest(){
        Cylinder cylinder = new Cylinder(2.0);
        Assert.assertEquals(2.0, cylinder.getRadius(), 0.01);
    }
    @Test
    public void cylinderConstructorNoParametersTest(){
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(), 0.01);
    }
    @Test
    public void cylinderConstructorTest(){
        Cylinder cylinder = new Cylinder(3.0, 4.0);
        Assert.assertEquals(3.0, cylinder.getRadius(), 0.01);
        Assert.assertEquals(4.0, cylinder.getHeight(), 0.01);
    }
    @Test
    public void cylinderConstructorTest2(){
        Cylinder cylinder = new Cylinder(2.0, 5.0, "green");
        Assert.assertEquals(2.0, cylinder.getRadius(), 0.01);
        Assert.assertEquals(5.0, cylinder.getHeight(), 0.01);
        Assert.assertEquals("green", cylinder.getColor());
    }
    @Test
    public void cylinderGetHeightTest(){
        Cylinder cylinder = new Cylinder(3.0, 11.0);
        Assert.assertEquals(11.0, cylinder.getHeight(), 0.01);
    }
    @Test
    public void cylinderGetVolumeTest(){
        Cylinder cylinder = new Cylinder(3.0, 4.0);
        Assert.assertEquals(113.09, cylinder.getVolume(), 0.1);
    }
}
