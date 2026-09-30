package Examples;

public class Example13Teory3 {
    public static void main(String[] args) {
        //Is there any non prime number in a range?
        int start=10, stop=15;
        //check all number from start to stop
        for(int i=start; i<=stop; i++){
            boolean isPrime=true;
            for(int j=2; j<=i/2; j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("There is a non prime number in my range");
            break;
        }
    }
}
}
