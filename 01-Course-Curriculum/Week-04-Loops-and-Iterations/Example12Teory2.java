package Examples;

public class Example12Teory2 {
    public static void main(String[] args) {
        //Is there any prime number in a range?
        int start=10, stop=15;
        //check all number from start to stop
        boolean isPrime=false;
        for(int i=start; i<=stop; i++){
            for(int j=2; j<=i/2; j++){
            if(i%j==0){
                isPrime=true;
                break;
            }
        }
        if(isPrime){
            System.out.println("There is a prime number in my range");
            break;
        }
    }
}
}
