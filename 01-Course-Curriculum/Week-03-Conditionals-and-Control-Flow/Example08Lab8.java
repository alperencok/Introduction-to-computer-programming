package Examples;

public class Example08Lab8 {
    public static void main(String[] args) {
        int number = 145;
        int digit = number % 10;
        if (digit < 5)
            number = number - digit;
        else
            number = number + (10 - digit);
        System.out.println(number);
    }
}
