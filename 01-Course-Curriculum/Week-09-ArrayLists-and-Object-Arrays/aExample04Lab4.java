package Examples;

public class aExample04Lab4 {
    public static void main(String[] args) {
        int multi[][] = {{2, 4, 5},{1, 3, 6},{7, 8, 0}};
        for (int[] row : multi) {
            int sum = 0;
            for (int num : row) {
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
