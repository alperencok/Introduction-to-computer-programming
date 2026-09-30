package Examples;

public class Example23Teory15 {
    public static void main(String[] args) {
    // Get the number of numbers between 1 and 30 devided by 7
    int i=1;
    int sum=0;
    int stop=30;
    int count=0;
    while (i<=stop) {
        if (i%7==0) {
        sum=sum+i;
        count++;
        System.out.println("i="+ i + " sum=" + sum);
        }
        i++;
        }
        System.out.println("Count= "+count);
    }
}
