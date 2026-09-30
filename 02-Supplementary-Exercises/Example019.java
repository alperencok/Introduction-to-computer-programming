package Examples;

public class Example019 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++){
            for(int column=row; column<=n; column++){
                System.out.print("  ");
            }
            for(int column=1; column<row; column++){
                System.out.print("* ");
            }
            for(int column=1; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
