package Examples;

public class Example04Lab4 {
    public static void main(String[] args) {
        int n=5;
        int multiplier=3;

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i+j==n-1) {
                    System.out.print((i+1)*multiplier + "  ");
                } else {
                    System.out.print("x  ");
                }
            }
            System.out.println("");
        }
    }
}
