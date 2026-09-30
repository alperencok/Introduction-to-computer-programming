package Examples;

public class Example14Teory9 {
    public static void main(String[] args) {
        int i=5;
        long l=10L;
        l=i;  //implicit automatic
        System.out.println(l);

        i=(int)l;  //explicit casting
        System.out.println(i);
    }
}
