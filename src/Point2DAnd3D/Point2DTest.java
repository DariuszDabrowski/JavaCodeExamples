package Point2DAnd3D;


import org.junit.Assert;
import org.junit.Test;

public class Point2DTest {

    @Test
    public void point2DDefaultConstructorTest() {
        Point2D testP2D = new Point2D();
        Assert.assertEquals(0f, testP2D.getX(), 0.01);
        Assert.assertEquals(0f, testP2D.getY(), 0.01);
    }
}
