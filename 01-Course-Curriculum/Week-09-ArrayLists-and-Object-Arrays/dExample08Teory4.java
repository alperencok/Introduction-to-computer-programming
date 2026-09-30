package Examples;

public class dExample08Teory4 {
    // Different type of bExample06Teory2
    public static void main(String[] args) {
        int[][] numbers={{1,3},{1,7,2},{8}};
        int sum=0;
        for(int[] elements:numbers){
            for(int n:elements){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
