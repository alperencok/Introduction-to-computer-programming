package Examples;

public class aExample01Lab1 {

    public static void main(String[] args) {
        int array[] = {1, 4, 2, 3, 7};
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + (sum / array.length));
    }
}
