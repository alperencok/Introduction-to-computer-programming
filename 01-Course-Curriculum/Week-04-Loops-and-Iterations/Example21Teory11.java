package Examples;

public class Example21Teory11 {
        public static void main(String[] args) {
    /*
    1 2 3 4
    2 4 6
    3 6
    4
    */
    int columnTotal;
        int previousColumnTotal=1;
        for(int row=1; row<=4; row++){
            columnTotal=0;
            for(int column=1; column<=5-row; column++){
                System.out.print((column*row)+" ");
            }
            System.out.println("");
        }
    }
}
