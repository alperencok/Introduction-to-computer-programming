package Examples;

public class Example02Lab2 {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("a: " +a+" --- b: "+b);
        int temp;
        temp=b;
        b=a;
        a=temp;
        System.out.println("a: " +a+"  --- b: "+b);
    }
}
