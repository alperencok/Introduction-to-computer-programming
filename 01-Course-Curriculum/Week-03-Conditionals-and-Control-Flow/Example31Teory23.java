package Examples;

public class Example31Teory23 {
    public static void main(String[] args) {
        // Is there any number devided by 7 in a range
        boolean isNumberDevidedBy7=false;
        for (int i=0; i<10; i++) {
            if (i%7==0) {
                isNumberDevidedBy7=true;
                break;
            }
            System.out.println(i);
        }
        System.out.println(isNumberDevidedBy7);
    }
}
