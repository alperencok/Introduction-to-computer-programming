package Examples;

public class Example022 {
    public static void sumUpperLowerTriangle(int[][] matrix){

        int altUcgen=0;
        int ustUcgen=0;

        for(int satir=0; satir<matrix.length; satir++){
            for(int sutun=0; sutun<matrix[satir].length; sutun++){
                if(satir>sutun){
                    altUcgen += matrix[satir][sutun];
                }
                if(sutun>satir){
                    ustUcgen += matrix[satir][sutun];
                }
            }
        }
        System.out.println(altUcgen);
        System.out.println(ustUcgen);
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,3,5},
            {2,4,6},
            {7,8,9}
        };
        sumUpperLowerTriangle(matrix);
    }
}
