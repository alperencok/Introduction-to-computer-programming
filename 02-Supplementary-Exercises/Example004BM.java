package Examples;

import java.util.Scanner;

public class Example004BM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the lover band: ");
        int lb=input.nextInt();
        System.out.println("Please enter the upper band: ");
        int ub=input.nextInt();
        int rnd_nbr=lb+((int)(Math.random() * (ub-lb+1)));
        System.out.println("Random Number: " + rnd_nbr);

        // lb=5 - ub=15
        //lb + ((int)(Math.random() * (ub-lb+1)))
        //5 + (0,99999 * (15-5))
    }
}
