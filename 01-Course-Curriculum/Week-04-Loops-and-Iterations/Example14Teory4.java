package Examples;

public class Example14Teory4 {
    public static void main(String[] args) {
        //Example13Teory3 with labeled loop
        //Is there any non prime number in a range?
        int start=10, stop=15;
        outerLoop:
        //check all number from start to stop
        for(int i=start; i<=stop; i++){
            boolean isPrime=true;
            for(int j=2; j<=i/2; j++){
                //System.out.println("i:"+i+"- j"+j);
                if(i%j==0){
                isPrime=false;
                System.out.println("There is a non prime number in my range");
                break outerLoop;
                //goto outerLoop we have goto word but we can't use
                }
            }
        }
    }
}
