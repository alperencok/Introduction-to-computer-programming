package Examples;

public class Example07Lab7 {
    public static void main(String[] args) {
        int a=10, b=15, c=3, d=5;
        int max = (a>=b ? a : b);
        max = (max>=c ? max : c);
        max = (max>=d ? max : d);
        System.out.println("Max=" + max);
    }
}
