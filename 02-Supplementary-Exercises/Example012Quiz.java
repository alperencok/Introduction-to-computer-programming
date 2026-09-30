package Examples;

public class Example012Quiz {
    public static void main(String[] args) {
        int lowerBound=10, upperBound=25;  // lb=15, ub=20
        boolean divisible=false;
        int i=1;
        for(i=upperBound; i>=lowerBound; i--){
            if(i%7==0){
                divisible=true;
                break;
            }
        }
        if(!divisible){
            System.out.println("There is no divisible");
        }else{
            System.out.println(i);
        }
    }
}
