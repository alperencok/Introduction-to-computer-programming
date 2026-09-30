package Examples;

public class aExample03Lab3 {
public static void main(String[] args) {
        double sum = 0;
        int counter = 0;
        int multi[][] = {{2, 4, 5},{1, 3, 6},{7, 8, 0}};
        for (int[] row : multi) {
            for (int num : row) {
                sum += num;
                counter++;
            }
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + sum /counter);
    }
}
