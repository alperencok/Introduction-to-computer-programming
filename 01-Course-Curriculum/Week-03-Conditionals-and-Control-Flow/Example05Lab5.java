package Examples;

public class Example05Lab5 {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        if (a>b && a>c) {
            System.out.println("A is biggest");
        }else if (b>a && b>c) {
            System.out.println("B is biggest");
        }else if (c>a && c>b) {
            System.out.println("C is biggest");
        }  // These are two types
        int k=4, l=5, m=5;
        if (k>=l && k>=m) {
            System.out.println(k);
        }else if (l >= m) {
            System.out.println(l);
        }else {
            System.out.println(m);
        }
    }
}
