package Examples;

public class Example02Lab2 {
    public static void main(String[] args) {
        int largestPowerOf2=1;
        int number=58;
        while(number>largestPowerOf2){
            largestPowerOf2<<=1;
        }
        largestPowerOf2>>=1;
        System.out.println(largestPowerOf2);
    }
}
