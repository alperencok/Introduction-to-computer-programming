package Examples;

public class Example021 {
    public static void main(String[] args) {
        int n=5;
        for (int row=1; row<=n; row++) {
            for (int column=row; column<n; column++) {
                System.out.print("  ");
            }
            for (int column=1; column<=(2*row-1); column++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int row=1; row<=n-1; row++) {
            for (int column=1; column<=row; column++) {
                System.out.print("  ");
            }
            for (int column=1; column<=(2*(n-row)-1); column++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
