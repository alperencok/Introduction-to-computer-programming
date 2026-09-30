package Examples;

public class aTest {
    public static void main(String[] args) {
        aIShape s=new aRectangle(10, 5);
        System.out.println(s.getArea());

        aShape s1=new aShape();
        s1.getArea();
    }
}
