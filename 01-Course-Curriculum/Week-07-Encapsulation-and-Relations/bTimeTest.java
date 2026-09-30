package Examples;

public class bTimeTest {
    public static void main(String[] args) {
        bTime t=new bTime();
        t.hour=23;
        t.minute=59;
        t.second=55;
        for(int i=0; i<100; i++){
        t.displayTime();
        t.incrementSecond();
        }
        {
        System.out.println("-----v2-----");
        }
        t.h=23;
        t.m=59;
        t.s=55;
        for(int i=0; i<100; i++){
        t.displayT();
        t.incS();
        }
    }
}
