package Examples;

import java.util.Scanner;

public class Example006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words seperated by spaces: ");

        String stW = input.next();
        String ndW = input.next();
        String rdW = input.next();

        System.out.println("first word is " + stW);
        System.out.println("second word is " + ndW);
        System.out.println("third word is " + rdW);

    }
}
