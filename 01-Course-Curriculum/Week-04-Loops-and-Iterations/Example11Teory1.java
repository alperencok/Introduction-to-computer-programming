package Examples;

public class Example11Teory1 {
    public static void main(String[] args) {
        //decide a number is prime or not (check logic carefully)
        int number=23;
        boolean isPrime=false;
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println("Prime or not: " + isPrime);
    }
}
