package Examples;

public class Example010forE {
    // Triangle pattern demonstration
    public static void main(String[] args) {
        int n = 11;   // Height of the triangle (7 rows)

        // Upper part of the triangle (first row)
        System.out.println("          E");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
