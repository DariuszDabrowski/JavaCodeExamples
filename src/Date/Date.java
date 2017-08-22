package Date;


public class Date {

    private int _day;
    private int _month;
    private int _year;

    public Date(int day, int month, int year) {
        String msg = "Wrong Input!";
        if (day >= 1 && day <= 31)
            _day = day;
        else {
            System.out.println(msg);
        }
        if (month >= 1 && month <= 12)
            _month = month;
        else {
            System.out.println(msg);
        }
        if (year >= 1900 && year <= 9999)
            _year = year;
        else {
            System.out.println(msg);
        }
    }
    public int getDay() { return _day; }

    public int getMonth() { return _month; }

    public int getYear() { return _year; }

    public void setDay(int day) { _day = day; }

    public void setMonth(int month) { _month = month; }

    public void setYear(int year) { _year = year; }

    public void setDate(int day, int month, int year) {
        _day = day;
        _month = month;
        _year = year;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (_day < 10)
            builder.append("0" + _day + "/");
        else
            builder.append(_day + "/");
        if (_month < 10)
            builder.append("0" + _month + "/");
        else
            builder.append(_month + "/");
        builder.append(_year);
        return String.valueOf(builder);

    }
}
