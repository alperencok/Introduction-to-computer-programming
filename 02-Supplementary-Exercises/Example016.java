package Examples;

public class Example016 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++){
            for(int column=row; column<=n; column++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
