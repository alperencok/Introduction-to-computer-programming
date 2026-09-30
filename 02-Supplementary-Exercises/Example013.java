package Examples;

public class Example013 {
    public static void main(String[] args) {
        int number=2987;
        int biggest=0;
        while(number>0){
            int digit=number%10;
            if(digit>biggest){
                biggest=digit;
            }
            number=number/10;
        }
        System.out.println(biggest);
    }
}
