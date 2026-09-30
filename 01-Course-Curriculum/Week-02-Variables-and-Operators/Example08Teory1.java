package Examples;

public class Example08Teory1 {
    public static void main(String[] args) {
        int i=2+3;
        // int j=""+1; // it cannot work
        System.out.println(i);

        System.out.println("i="+2+3);
        // plus convert int to string
        // string + string + work as concat

        System.out.println("i="+"2+3");
        // string + integer + work as concat

        System.out.println("i="+i);
        // integer + integer + work as math operator
    }
}
