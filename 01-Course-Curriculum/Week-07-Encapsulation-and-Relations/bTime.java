package Examples;

public class bTime {
    int second, minute, hour;

    void incrementSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
            }
        }
    }
    void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
        }
    }
     void incrementHour() {
        hour++;
        if (hour == 24) {
             hour=0;
        }
    }
    void displayTime() {
        System.out.println(hour + " : " + minute + " : " + second);
    }
    int h, m, s;
        void incS(){
        s++;
        if(s==60){
            s=0;
            incM();
        }
    }
    void incM(){
        m++;
        if(m==60){
            m=0;
            incH();
        }
    }
    void incH(){
        h++;
        if(h==24){
            h=0;
        }
    }
    void displayT(){
        System.out.println(h + " : " + m + " : " + s);
    }
}
