package Examples;

public class Example20Teory12 {
    public static void main(String[] args) {
    // Display odd number between 0 to 20
    int i=1;
    int stop=20;
    while (i<=stop) {
        if (i%2==1) {
        System.out.println(i);
        // i+=2; it depens on start value
        }
        i++;
    }
    }
}
