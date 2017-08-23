package Time;


public class Time {
    private int _hour;
    private int _minute;
    private int _second;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public int getHour() { return _hour;}
    public int getMinute() { return _minute;}
    public int getSecond() { return _second;}

    public void setHour(int hour) {_hour = hour;}
    public void setMinute(int minute) {_minute = minute;}
    public void setSecond(int second) {_second = second;}

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24)
            _hour = hour;
        else
            _hour = 0;
        if (minute >= 0 && minute < 60)
            _minute = minute;
        else
            _minute = 0;
        if (second >= 0 && second < 60)
            _second = second;
        else
            _second = 0;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (_hour < 10)
            sb.append("0" + _hour);
        else
            sb.append(_hour);
        sb.append(":");
        if (_minute < 10)
            sb.append("0" + _minute);
        else
            sb.append(_minute);
        sb.append(":");
        if (_second < 10)
            sb.append("0" + _second);
        else
            sb.append(_second);
        return sb.toString();
    }
    public Time nextSecond() {
        if (_second == 59) {
            _second = 0;
            if (_minute == 59){
                _minute = 0;
                if (_hour == 23) {
                    _hour = 0;
                } else{
                    _hour++;
                }
            } else {
                _minute++;
            }
        } else {
            _second++;
        }
        return this;
    }
    public Time previousSecond() {
        if (_second == 0) {
            _second = 59;
            if (_minute == 0){
                _minute = 59;
                if (_hour == 0) {
                    _hour = 23;
                } else{
                    _hour--;
                }
            } else {
                _minute--;
            }
        } else {
            _second--;
        }
        return this;
    }

}
