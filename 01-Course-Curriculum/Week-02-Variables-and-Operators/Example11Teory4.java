package Examples;

public class Example11Teory4 {
    public static void main(String[] args) {
        int x=1, y=2;
        int z;
        // z=(x++)+(++x);
        //     1  +  3 = 4
        // System.out.println(z);

        z=(x++)+(x++);
        //  1  +  2 = 3
        System.out.println(z);

        x=1;
        z=(++x*2)+x++;
        //   4   + 2 = 6
        System.out.println(z);
    }
}
