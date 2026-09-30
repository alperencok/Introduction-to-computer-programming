package Examples;

public class Example19Teory9 {
    public static void main(String[] args) {
        /*
        1
        1 2
        3 6 9
        18 36 54
        */
        int columnTotal;
        int previousColumnTotal=1;
        for(int row=1; row<=4; row++){
            columnTotal=0;
            for(int column=1; column<=row; column++){
                System.out.print(column*previousColumnTotal+" ");
                columnTotal=columnTotal+(column*previousColumnTotal);
            }
            previousColumnTotal=columnTotal;
            System.out.println("");
        }
    }
}
