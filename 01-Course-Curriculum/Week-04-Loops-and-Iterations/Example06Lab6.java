package Examples;

public class Example06Lab6 {
    public static void main(String[] args) {
        // Implementation matching the exercise specification
        int number1=45;
        int number2=30;
        int i=1;
        int cevap=0;
        while(i<=number1 && i<number2){
            if(number1%i==0 && number2%i==0){
                cevap=i;
            }
            i++;
        }
        System.out.println(cevap);
    }
}
