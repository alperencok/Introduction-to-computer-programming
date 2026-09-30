package Examples;

public class bExample05Teory1 {
    //{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}
    public static void main(String[] args) {
        int[][] numbers=new int[5][4];
        numbers[0][0]=5;
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.println(i+":"+j);
                sum+=numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
