package Examples;

public class aExample02Lab2 {
    public static void main(String[] args) {
        int array[] = {1, 4, 20, 3, 7};
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }
        System.out.println("max is: " + max);
    }
}
