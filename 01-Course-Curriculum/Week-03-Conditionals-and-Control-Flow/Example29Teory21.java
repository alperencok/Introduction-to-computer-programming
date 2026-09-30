package Examples;

public class Example29Teory21 {
    public static void main(String[] args) {
        /* write a star at once in print or println
        *****
        *****
        *****
        *****
        *****
        */
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");  // Must use print instead of println
            }
            System.out.println("");
        }
    }
}
