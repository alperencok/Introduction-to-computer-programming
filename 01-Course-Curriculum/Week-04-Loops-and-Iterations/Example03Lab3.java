package Examples;

public class Example03Lab3 {
    // kendi versiyonum
    public static void main(String[] args) {
        int number=3000;
        int i=1;
        int sum=0;
        int result;
        while (i<=100 && sum+i<3000) {
            sum+=i;
            result=i+1;
            if (result>3000) {
                number++;
            }
            else if (result<3000) {
                number--;
        }
        System.out.println("i: " + i + " | sum: " + sum + " | number: " + number);
        i++;
        }
        System.out.println("Final sum: " + sum);
    }
}
