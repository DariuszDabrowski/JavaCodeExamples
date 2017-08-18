package SimpleCircle;


import org.junit.Assert;
import org.junit.Test;

public class SimpleCircleTests {

    @Test
    public void circleDefaultRadiusTest() {
        SimpleCircle testCircle = new SimpleCircle();
        Assert.assertEquals(1.0, testCircle.getRadius(), 0.01);
    }
    @Test
    public void circleRadiusTest() {
        SimpleCircle testCircle = new SimpleCircle(2.0);
        Assert.assertEquals(2.0, testCircle.getRadius(), 0.01);
    }
    @Test
    public void circleSetRadiusTest() {
        SimpleCircle testCircle = new SimpleCircle(2.0);
        testCircle.setRadius(3.0);
        Assert.assertEquals(3.0, testCircle.getRadius(), 0.01);
    }
    @Test
    public void circleGetAreaTest() {
        SimpleCircle testCircle = new SimpleCircle(2.0);
        Assert.assertEquals(12.56, testCircle.getArea(), 0.01);
    }
    @Test
    public void circleGetCircumferenceTest() {
        SimpleCircle testCircle = new SimpleCircle(1.0);
        Assert.assertEquals(6.28, testCircle.getCircumference(), 0.01);
    }
    @Test
    public void circleToStringTest() {
        SimpleCircle testCircle = new SimpleCircle(2.0);
        Assert.assertEquals("Circle[radius= 2.0]", testCircle.toString());
    }

}
