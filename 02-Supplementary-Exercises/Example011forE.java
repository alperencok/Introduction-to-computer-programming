package Examples;

public class Example011forE {
    // Number pattern demonstration
    public static void main(String[] args) {
        int n = 11;
        System.out.println("          E");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
