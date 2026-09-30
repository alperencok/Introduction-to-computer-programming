package Examples;

public class Example30Teory22 {
    public static void main(String[] args) {
        /* write a star at once in print or println
        *
        **
        ***
        ****
        *****
        */
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
