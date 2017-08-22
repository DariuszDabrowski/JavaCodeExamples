package Date;


import org.junit.Assert;
import org.junit.Test;

public class DateTest {

    @Test
    public void dateTest() {
        Date testDate = new Date(5, 7, 2018);
        Assert.assertEquals(5, testDate.getDay());
        Assert.assertEquals(7, testDate.getMonth());
        Assert.assertEquals(2018, testDate.getYear());
    }
    @Test
    public void dateTest2() {
        Date testDate = new Date(32, 13, 1899);
        Assert.assertEquals(0, testDate.getDay());
        Assert.assertEquals(0, testDate.getMonth());
        Assert.assertEquals(0, testDate.getYear());
    }
    @Test
    public void dateGetDayTest() {
        Date testDate = new Date(25, 7, 2018);
        Assert.assertEquals(25, testDate.getDay());
    }
    @Test
    public void dateGetMonthTest() {
        Date testDate = new Date(25, 12, 2018);
        Assert.assertEquals(12, testDate.getMonth());
    }
    @Test
    public void dateGetYearTest() {
        Date testDate = new Date(25, 7, 2017);
        Assert.assertEquals(2017, testDate.getYear());
    }
    @Test
    public void dateSetDayTest() {
        Date testDate = new Date(25, 7, 2018);
        testDate.setDay(19);
        Assert.assertEquals(19, testDate.getDay());
    }
    @Test
    public void dateSetMonthTest() {
        Date testDate = new Date(25, 7, 2018);
        testDate.setMonth(12);
        Assert.assertEquals(12, testDate.getMonth());
    }
    @Test
    public void dateSetYearTest() {
        Date testDate = new Date(25, 7, 2018);
        testDate.setYear(1981);
        Assert.assertEquals(1981, testDate.getYear());
    }
    @Test
    public void dateSetDateTest() {
        Date testDate = new Date(5, 7, 2018);
        testDate.setDate(1, 12, 2000);
        Assert.assertEquals(1, testDate.getDay());
        Assert.assertEquals(12, testDate.getMonth());
        Assert.assertEquals(2000, testDate.getYear());
    }
    @Test
    public void dateToStringTest() {
        Date testDate = new Date(25, 7, 2018);
        Assert.assertEquals("25/07/2018", testDate.toString());
    }





}
