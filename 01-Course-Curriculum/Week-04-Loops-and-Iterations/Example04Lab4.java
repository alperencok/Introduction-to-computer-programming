package Examples;

public class Example04Lab4 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while (i<=100 && sum+1<3000) {
            sum+=i;
            System.out.println(i);
            i++;
        }
        System.out.println(sum);
    }
}
