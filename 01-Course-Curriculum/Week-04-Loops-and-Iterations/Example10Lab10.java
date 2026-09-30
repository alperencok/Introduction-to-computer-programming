package Examples;

public class Example10Lab10 {
    public static void main(String[] args) {
        int number=12;
        int bNumber=0;
        int digit=1;
        while(number>0){
            bNumber=bNumber+digit*(number%2);
            number=number/2;
            digit*=10;
        }
        System.out.println(bNumber);
    }
}
