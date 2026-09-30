package Examples;

public class Example22Teory14 {
    public static void main(String[] args) {
    // Get the sum of numbers between 1 and 30devided by 7
    int i=1;
    int sum=0;
    int stop=30;
    while (i<=stop) {
        if (i%7==0) {
        sum=sum+i;
        System.out.println("i="+ i + " sum=" + sum);
        }
        i++;
        }
    }
}
