package Examples;

public class bExample06Teory2 {
    public static void main(String[] args) {
        int[][] numbers={{1,3},{1,7,2},{8}};
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.println(i+":"+j+":"+numbers[i][j]);
                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
