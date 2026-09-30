package Examples;

public class Example17Teory10 {
    public static void main(String[] args) {
        int i=0b1011;
        int j=0b1111;
        System.out.println(i & j);  // 1011
        System.out.println(i | j);  // 1111

        int a=11;
        int b=15;
        System.out.println(a & b);
        System.out.println(a | b);

        int m=0xB;
        int n=0xF;
        System.out.println(m & n);
        System.out.println(m | n);
        // values are same only format different
    }
}
