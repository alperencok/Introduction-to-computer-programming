package Examples;

public class Example20Teory10 {
    public static void main(String[] args) {
        /*
        1
        2 4
        3 6 9
        4 8 12 16
        */
        int columnTotal;
        int previousColumnTotal=1;
        for(int row=1; row<=4; row++){
            columnTotal=0;
            for(int column=1; column<=row; column++){
                System.out.print((column*row)+" ");
            }
            System.out.println("");
        }
    }
}
