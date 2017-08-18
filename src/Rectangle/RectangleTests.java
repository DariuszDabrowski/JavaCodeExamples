package Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTests {

    @Test
    public void rectangleDefaultTest() {
        Rectangle testRectangle = new Rectangle();
        Assert.assertEquals(1.0, testRectangle.getLength(), 0.01);
        Assert.assertEquals(1.0, testRectangle.getWidth(), 0.01);
    }
    @Test
    public void rectangleTest() {
        Rectangle testRectangle = new Rectangle(2.0f, 3.0f);
        Assert.assertEquals(2.0, testRectangle.getLength(), 0.01);
        Assert.assertEquals(3.0, testRectangle.getWidth(), 0.01);
    }
    @Test
    public void rectangleSetLengthTest() {
        Rectangle testRectangle = new Rectangle();
        testRectangle.setLength(4.0f);
        Assert.assertEquals(4.0, testRectangle.getLength(), 0.01);
    }

}
