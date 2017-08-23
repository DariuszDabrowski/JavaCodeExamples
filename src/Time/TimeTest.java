package Time;


import org.junit.Assert;
import org.junit.Test;

public class TimeTest {
    @Test
    public void timeDefaultGetHourGetMinuteGetSecondTest() {
        Time test = new Time(12,34,45);
        Assert.assertEquals(12, test.getHour());
        Assert.assertEquals(34, test.getMinute());
        Assert.assertEquals(45, test.getSecond());
    }
    @Test
    public void timeDefaultGetHourGetMinuteGetSecondTest2() {
        Time test = new Time(2,4,5);
        Assert.assertEquals(2, test.getHour());
        Assert.assertEquals(4, test.getMinute());
        Assert.assertEquals(5, test.getSecond());
    }
    @Test
    public void timeGetHourGetMinuteGetSecondTest() {
        Time test = new Time(25,67,68);
        Assert.assertEquals(0, test.getHour());
        Assert.assertEquals(0, test.getMinute());
        Assert.assertEquals(0, test.getSecond());
    }
}
