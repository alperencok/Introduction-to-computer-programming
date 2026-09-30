package Examples;

public class Example18Teory11 {
    public static void main(String[] args) {
        int i=2;  // 10 (binary)
        System.out.println(i<<2);  // 1000
        System.out.println(i);
        // inmutetable
        i=i<<2;
        System.out.println(i);

        // left shift

        int j=0b110;  //6
        System.out.println(j<<3);
        // 6.2=12 12.2=24 24.2=48

        // right shift

        int k=0b1011;
        System.out.println(k>>1);  // 101 (5)
        System.out.println(k>>4);
    }
}
