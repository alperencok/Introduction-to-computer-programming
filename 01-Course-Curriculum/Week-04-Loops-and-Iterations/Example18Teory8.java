package Examples;

public class Example18Teory8 {
    public static void main(String[] args) {
        // In a range how many number can be divided by 7?
        int divisor=7;
        int start=15, stop=50;
        int count=0;
        for(int i=start; i<=stop; i++){
            if(i%7==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
