package Examples;

public class Example14Teory7 {
    public static void main(String[] args) {
        int i=5;
        boolean dividedBy2;
        // dividedBy2=i%2; java cannot assign with numbers
        dividedBy2=i%2==0;
        System.out.println(dividedBy2);

        System.out.println(i%2==0 ? "Divided":"Not Devided");
    }
}
