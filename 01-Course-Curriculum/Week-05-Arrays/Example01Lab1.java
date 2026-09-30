package Examples;

public class Example01Lab1 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                if(i>=j){
                    System.out.print("- ");
                }else{
                    System.out.print((n-i-1)+" ");
                }
            }
            System.out.println("");
        }
    }
}
