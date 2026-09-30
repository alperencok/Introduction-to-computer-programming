package Examples;

public class Example05Lab5 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0; i<=100; i++){
            if(sum+i>3000){
                break;
            }
            sum+=i;
            System.out.println("Sum at iteration " + i + " -> " + sum);
        }
    }
}
