package Examples;

import java.util.Scanner;

public class Example005BM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rnd_1 = (int) (Math.random() * 10);
        int rnd_2 = (int) (Math.random() * 10);

        System.out.println(rnd_1 + "+" + rnd_2 + "=?");
        int answer = input.nextInt();
        if (rnd_1 + rnd_2 == answer) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
