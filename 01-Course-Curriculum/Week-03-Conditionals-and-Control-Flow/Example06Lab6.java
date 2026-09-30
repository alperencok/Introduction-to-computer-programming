package Examples;

public class Example06Lab6 {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        int max=(a>=b?a:b);
        max=(max>=c?max:c);
        System.out.println("Max="+max);
    }
}
