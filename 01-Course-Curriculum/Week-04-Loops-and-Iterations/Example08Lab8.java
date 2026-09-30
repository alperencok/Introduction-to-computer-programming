package Examples;

public class Example08Lab8 {
    public static void main(String[] args) {
        int number1=12;
        int number2=14;
        int greatest=1;
        for(int i=1; i<=number1 && i<=number2; i++){
            if (number1%i==0 && number2%i==0){
                greatest=i;
            }
        }
        System.out.println(greatest);
    }
}
