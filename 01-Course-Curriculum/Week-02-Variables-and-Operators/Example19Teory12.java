package Examples;

public class Example19Teory12 {
    public static void main(String[] args) {
        // 1: 00000000 00000000 00000000 00000001
        System.out.println(0b110>>1);
        //-1: 11111111 11111111 11111111 11111110

        System.out.println(-0b110>>1);
        //-6: 11111111 11111111 11111111 11111010
        //-0b110 >> 1 : 10111111 11111111 11111111 11111101

        System.out.println(-6>>>1);
        //-0b110 >> 1 : // Convert to decimal
    }
}
