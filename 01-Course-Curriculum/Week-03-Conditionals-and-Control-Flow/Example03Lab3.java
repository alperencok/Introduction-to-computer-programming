package Examples;

public class Example03Lab3 {
    public static void main(String[] args) {
        int number=15;
        if (number>=0 && number<10) {
            System.out.println("Small");
        }else if (number>=10 && number<=20) {
            System.out.println("Normal");
        }else if (number>20) {
            System.out.println("Very Large");
        }
    }
}
