package PowtorzenieZadanie1;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(){}

    public MyTime(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour,int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24){
            this.hour = hour;
        } else {
            this.hour = -1;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60){
            this.minute = minute;
        } else {
            this.minute = -1;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 59){
            this.second = second;
        } else {
            this.second = -1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.hour < 10)
            sb.append("0" + this.hour);
        else
            sb.append(this.hour);
        if (this.minute < 10)
            sb.append("0" + this.minute);
        else
            sb.append(this.minute);
        if (this.hour < 10)
            sb.append("0" + this.second);
        else
            sb.append(this.second);
        return sb.toString();
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            nextMinute();
        } else {
            this.second++;
        }
        return this;
    }
    public MyTime nextMinute() {
        if (this.minute == 59){
            this.minute = 0;
            nextHour();
        } else {
            this.minute++;
        }
        return this;
    }
    public MyTime nextHour() {
        this.hour = (this.hour + 1)%24;
        return this;
    }
    public MyTime previousSecond(){
        if (this.second == 0) {
            this.second = 59;
            previousMinute();
        } else {
            this.second--;
        }
        return this;
    }
    public MyTime previousMinute(){
        if (this.minute == 0){
            this.minute = 59;
            previousHour();
        } else {
            this.minute--;
        }
        return this;
    }
    public MyTime previousHour(){
        this.hour = (this.hour +1)%24;
        return this;
    }
}
