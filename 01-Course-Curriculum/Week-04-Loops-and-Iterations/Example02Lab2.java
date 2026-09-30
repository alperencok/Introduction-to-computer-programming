package Examples;

public class Example02Lab2 {
    public static void main(String[] args) {
        int number=5;
        int factorial=number;
        for (int i=number-1; i>1; i--){
            factorial*=1;
        }
        System.out.println(factorial);
    }
}
