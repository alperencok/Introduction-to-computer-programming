package Examples;

public class Example009BM {
    public static void main(String[] args) {
        System.out.printf("%8d%8s%8.1f\n", 1234, "JAVA", 5.63);
        System.out.printf("%-8d%-8s%-8.1f\n", 1234, "JAVA", 5.63);
        // // The .1f format specifier outputs only 1 decimal digit after the dot
    }
}
